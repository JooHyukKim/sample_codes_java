package vol1.chapter08;

public class PassBy {

    public static void main(String[] args) {
        MemberDto member = new MemberDto("Before Reference");
        String name = "Before Value";

        System.out.println("--------------------------");
        System.out.println("member  : " + member.toString());
        System.out.println("value : " + name);

        System.out.println("--------------------------");
        passByReference(member);
        passByValue(name);

        System.out.println("--------------------------");
        System.out.println("member  : " + member.toString());
        System.out.println("value : " + name);
    }

    private static void passByValue(String name) {
        name = "value : changed";
        System.out.println(name);

    }

    private static void passByReference(MemberDto member) {

        member.setName("Changed member name");
        System.out.println("member : " + member);
    }

}

class MemberDto {
    private String name;

    public MemberDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
