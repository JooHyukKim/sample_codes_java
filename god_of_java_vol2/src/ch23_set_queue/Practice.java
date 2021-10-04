package ch23_set_queue;

import java.util.HashSet;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {

        RandomNumberMaker maker = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            System.out.println(maker.getSixNumber());
        }
    }

}

class RandomNumberMaker{

    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> hashSet = new HashSet<>();

        Random rand = new Random();
        while (hashSet.size() < 6) {
            hashSet.add(rand.nextInt(45));
        }
        return hashSet;
    }
}
