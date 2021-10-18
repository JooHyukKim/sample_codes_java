package sorting;

public class PersonName {
    String name;
    int age;

    @Override
    public String toString() {
        return "PersonName{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int valueOfName() {
        switch (this.name) {
            case "첫번째":
                return 1;
            case "두번째":
                return 2;
            case "세번째":
                return 3;
            case "네번째":
                return 4;
            case "다섯번째":
                return 5;
            case "여섯번째":
                return 6;
            case "일곱번째":
                return 7;
            default:
                return -1;
        }
    }
}

