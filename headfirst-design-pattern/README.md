# Head First Design Pattern 책 학습 내용

## Design Principles

### 전략패턴 Strategy Pattern

- Encapsulate what varies
- Favor composition over inheritance
- Program to an interface, not an implementation

### 옵저버 패턴 Observer Pattern : one-to-many dependency between objects so that when one object changes state, all its

dependents are notified and updated automatically

- Strive for loosely coupled designs between objects that interact

### Decorator Pattern

- Classes should be open for extension, but closed for modification
- "Beverages with added condiments"

### Factory

- relies on INHERITANCE
- to allow a class to defer instantiation to its subclasses

### Abstract Factory

- relies on COMPOSITION
- to create families of related objects without having to depend on their concrete classes

### Singleton

### Command Pattern

- Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log
  requests, and support undoable operations
- used in queuing requests && logging queues

### Adaptor Pattern

- The Adapter Pattern converts the interface of a class into another interface the clients expect. Adapter let's classes
  work together that couldn't otherwise because of incompatible interfaces.
- there is class adapter using inheritance and object adapter using composition
- 상속을 활용한 class adapter가 코드 재사용성은 높으나 결합이 심하다. 구성을 활용한 object adapter는 코드 재사용성은 떨어지나 결합도가 낮다.
- When you need to use an existing class and its interface is not the one you need, use an adapter.
- An adapter changes an interface into one a client expects.
- Implementing an adapter may require little work or a great deal of work depending on the size and complexity of the
  target interface.
- There are two forms of the Adapter Pattern: object and class adapters. Class adapters require multiple inheritance.
- An adapter wraps an object to change its interface, a decorator wraps an object to add new behaviors and
  responsibilities, and a facade “wraps” a set of objects to simplify.

### Facade Pattern

- provides a unified interface to a set of interfaces in a subsystem.
- Facade defines a higher-level interface that makes the subsystem easier to use
- "talk only to your immediate friends"
    - be careful of the number of classes it interacts with, and also how it comes to interact with those classes
- When you need to simplify and unify a large interface or complex set of interfaces, use a facade.
- A facade decouples a client from a complex subsystem.
- Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of
  the facade.
- You can implement more than one facade for a subsystem.

## Important Notes

- the only constant in software is **CHANGE**
