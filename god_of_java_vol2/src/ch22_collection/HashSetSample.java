package ch22_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample<S> {
    public static void main(String[] args) {
        String[] carTypes = new String[]{
                "bmw",
                "benz"

        };

        new HashSetSample<>().getCarKinds(carTypes);

    }

    public void getCarKinds(String[] kinds){
        Set<String> set = new HashSet<>();

        for (String k :
                kinds) {
            set.add(k);
        }

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------------------");
        System.out.println(set.size());
    }
}
