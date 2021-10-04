package vol1.chapter08;

public class DotDotDot {

    public static void main(String[] args) {

        dot(1, 2, 3, 44, 5);

        dotdotdot("hi! these are member list"
                , new MemberDto("John")
                , new MemberDto("Michale")
                , new MemberDto("Vince")
        );
    }

    static void dot(int... args) {
        for (int a :
                args) {
            System.out.println(a);
        }
    }

    static void dotdotdot(String s, MemberDto ... memberlist){
        System.out.println("------------"+ s    );

        for (int a = 0; a < memberlist.length; a++) {
            System.out.println(memberlist[a]);
        }
    }
    /* 컴파일 에러
    static void dotdot(String... args, int hi) {

    }*/
}
