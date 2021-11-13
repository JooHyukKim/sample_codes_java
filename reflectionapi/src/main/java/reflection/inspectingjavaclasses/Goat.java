package reflection.inspectingjavaclasses;

public class Goat extends Animal implements Locomotion {
    public String goat;

    public Goat(String goat) {
        super();
        this.goat = goat;
    }

    @Override
    protected String getSound() {
        return "bleat";
    }

    @Override
    public String eats() {
        return "grass";
    }

    @Override
    public String getLocomotion() {
        return "walks";
    }
}
