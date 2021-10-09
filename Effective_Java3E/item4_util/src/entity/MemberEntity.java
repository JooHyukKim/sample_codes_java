package entity;

import java.security.PublicKey;

public class MemberEntity {

    private final int numberOfVisits;

    private final int daysSinceRegistration;

    public MemberEntity(int numberOfVisits, int daysSinceRegistration) {
        this.numberOfVisits = numberOfVisits;
        this.daysSinceRegistration = daysSinceRegistration;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public int getDaysSinceRegistration() {
        return daysSinceRegistration;
    }
}
