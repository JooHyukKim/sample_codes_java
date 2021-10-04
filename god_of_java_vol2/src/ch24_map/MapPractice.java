package ch24_map;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class MapPractice {
    private final int DATA_BOUNDARY = 50;

    public Hashtable<Integer, Integer> hashtable = new Hashtable<>();


    public static void main(String[] args) {



        MapPractice mapPractice = new MapPractice();
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            mapPractice.putCurrentNumber(random.nextInt(mapPractice.DATA_BOUNDARY));
        }

        Set<Integer> keySet = mapPractice.hashtable.keySet();
        keySet.forEach(keyset -> {
            if (keyset % 10 - 1 == 0) {
                System.out.println();
            }
            System.out.print(keyset + "=" + mapPractice.hashtable.get(keyset) + " | ");
        });
    }


    public MapPractice getRand() {


        return null;
    }

    public void putCurrentNumber(int temp) {
        if (!hashtable.containsKey(temp)) {
            hashtable.put(temp, 1);
            return;
        }
        hashtable.put(
                temp
                , hashtable.get(temp) + 1
        );
    }
}
