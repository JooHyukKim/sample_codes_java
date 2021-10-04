package ch25_thread.sync;

public class CommonCalculate {
    private int amount;

    public CommonCalculate() {
        this.amount = 0;
    }
    public void plus(){

        amount++;
    }

    public synchronized void plus(int value){
        amount += value;
    }

    public void minus(int value){
        amount -= value;
    }

    public int getAmount(){
        return amount;
    }
}
