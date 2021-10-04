package ch25_thread.sync;

public class ModifyAmountThread extends Thread {
    private CommonCalculate commonCalculate;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate commonCalculate, boolean addFlag) {
        this.commonCalculate = commonCalculate;
        this.addFlag = addFlag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (addFlag) {
                commonCalculate.plus(1);
                continue;
            }

            commonCalculate.minus(1);
        }
    }
}
