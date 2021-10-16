package lemon;

public class BestLemon implements Lemon {

    private String acidity;
    private String color;
    private int size;

    // 1. 생성자 메소드를 private으로 변경하여 캡슐화한다.
    private BestLemon(String acidity, String color, int size) {
        this.acidity = acidity;
        this.color = color;
        this.size = size;
    }

    @Override
    public void squeeze() {
        System.out.println("Best Lemon Squeeze¬");
    }

    // 2. 빌더로 사용할 내부 정적 클래스를 생성한다.
    //    클래스명은 일반적으로 Builder, 또는 부모클래스명 + Builder 를 사용합니다.
    public static class Builder {
        private String acidity;
        private String color;
        private int size;

        // 3. 대상 클래스 생성자의 매개변수를 매개변수 이름으로 메소드화하고 Builder를 리턴한다.
        public Builder acidity(String acidity) {
            this.acidity = acidity;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        // 4. 마지막으로 build 메소드를 통해 인스턴스를 리턴한다.
        public BestLemon build() {
            return new BestLemon(acidity, color, size);
        }
    }


}
