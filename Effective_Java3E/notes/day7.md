# Day 7. Generic Method와 Generic의 주의사항 / Item 30~33

 
---
---


## Item 30. 이왕이면 제네릭 메서드로 만들라


- 때때로 불변 객체를 여러 타입으로 활용할 수 있게 만들어야 할 때가 있다.
- 제네릭은 런타임에 타입 정보가 소거 되므로 하나의 객체를 어떤 타입으로든 매개변수화할 수 있다.
 
###핵심 정리
- 제네릭 타입과 마찬가지로, 클라이언트에서 입력 매개변수와 반환값을 명시적으로 형변환해야 하는 메서드보다 제네릭 메서드가 더 안전하며 사용하기도 쉽다.
- 타입과 마찬가지로 메서드도 형변환 없이 사용할 수 있는 편이 좋으며, 많은 경우 그렇게 하려면 제네릭 메서드가 되어야 한다.
- 역시 타입과 마찬가지로, 형변환 해줘야 하는 기존 메서드는 제네릭하게 만들자.
- 기존 클라이언트는 그대로 둔 채 새로운 사용자의 삶을 훨씬 편하게 만들어줄 것이다.
 

---
---


## Item 31. 한정적 와일드카드를 사용해 API 유연성을 높이라.

- PECS, producer-extends, consumer-super
- 매개변수화 타입 T가 생상자라면 <? extends T> 를 사용하고,
- 소비자라면 <? supser T>를 사용하라.
- 반환 타입에는 한정적 와일드 카드 타입을 사용하면 안 된다. 유연성을 높여주기는 커녕 클라이언트 코드에서도 와일드카드 타입을 써야 하기 때문이다.
- 타입 매개변수를 직접 구현하지 않고, 직접 구현한 다른 타입을 확장한 타입을 지원하기 위해 와일드 카드가 필요하다.
- 기본 규칙은 이렇다. 메서드 선언에 타입 매개변수가 한 번만 나오면 와일드 카드로 대체하라.
 

### 핵심 정리
- 조금 복잡하더라도 와일드 카드 타입을 적용하면 API 가 훨씬 유연해진다.
- 그러니 널리 쓰일 라이브러리를 작성한다면 반드시 와일드카드 타입을 적절히 사용해줘야 한다.
- PECS 공식을 기억하자. 즉, 생산자는 extends를, 소비자는 super를 사용한다. Comparable과 Comparator는 모두 소비자라는 사실도 잊지 말자.
 


---
---



## Item 32. 제네릭과 가변 인수를 함께 쓸 때는 신중하라

- 제네릭과 varargs 를 혼용하면 타입 안정성이 깨진다.

```java
static void dangerous(List<String> ...stringLists){
    List..
    ...
```

- 제네릭 varargs 매개변수 배열에 다른 메서드가 접근하도록 허용하면 안전하지 않다.
- @SafeVarargs 애너테이션을 사용해야 할 때를 정하는 규칙은 간단하다.
- 제네릭이나 매개변수화 타입의 varargs 매개변수를 받는 모든 메서드에 @SafeVarargs를 달라. 그래야 사용자를 헷갈리게 하는 컴파일러 경고를 없앨 수 있다. 결국 우리가 통제하는 메서드 중 진짜 힙오염경고로부터 안전한지 점검된 메서드만 사용해야한다.
 

### 핵심 정리
- 가변인수와 제네릭은 궁합이 좋지않다.
- 가변인수 기능은 배열을 노출하여 추상화가 완벽하지 못하고, 배열과 제네릭의 타입 규칙이 서로 다르기 때문이다.
- 제네릭 varargs 매개변수는 타입 안전하지는 않지만, 허용된다.
- 메서드에 제네릭 (혹은 매개변수화 된) varargs 매개변수를 사용하고자 한다면, 먼저 그 메서드가 타입 안전한지 확인한 다음 @SafeVarargs 애너테이션을 달아 사용하는 데 불편함이 없게끔 하자.


---
---


## Item 33.타입 안전 이종 컨테이너를 고려하라

### 핵심 정리
- 컬렉션 API 로 대표되는 일반적인 제네릭 형태에서는 한 컨테이너가 다룰 수 있는 타입 매개변수의 수가 고정되어 있다.
- 하지만 컨테이너 자체가 아닌 키를 타입 매개변수로 바꾸면 이런 제약이 없는 타입 안전 이종 컨테이너를 만들 수 있다.
- 타입 안전 이종 컨테이너는 Class를 키로 쓰며, 이런 식으로 쓰이는 Class 객체를 타입 토큰이라 한다.
- 또한, 직접 구현한 키 타입도 쓸 수 있다.
- 예컨대 데이터베이스의 행(컨테이너)을 표현한 DatabaseRow 타입에는 제네릭 타입인 Column<T>를 키로 사용할 수 있다.



























