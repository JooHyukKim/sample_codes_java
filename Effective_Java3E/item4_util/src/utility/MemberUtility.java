package utility;

import entity.MemberEntity;

import java.util.function.Function;

public class MemberUtility {

    private static final float VIP_THRESHOLD = 0.1F;

    // 이 생성자는 인스턴스 생성을 막기위한 용도로 만들어졌습니다.
    private MemberUtility() {
        throw new AssertionError("This class instance SHOULD NOT be innitilized ");
    }

    public static boolean isVIP(MemberEntity memberEntity) {
        float visits = Integer.valueOf(memberEntity.getNumberOfVisits()).floatValue();
        float daysSinceReg = Integer.valueOf(memberEntity.getDaysSinceRegistration()).floatValue();

        // 사용자의 일평균 방문 횟수를 소수접까지 계산한다.
        // 5일에 한번 방문하는 고객을 우리는 VIP 라 부를 것이다.
        // 1회 / 10일 =  0.1이면 10일에 한번
        // 0.01이면 100일에 한번
        float frequency = visits / daysSinceReg;

        if (frequency >= VIP_THRESHOLD) {
            return true;
        }
        return false;
    }

}
