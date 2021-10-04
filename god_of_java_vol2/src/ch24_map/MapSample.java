package ch24_map;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "a");
        treeMap.put("가ㅏㅑ", "b");
        treeMap.put("c", "c");
        treeMap.put("ㄹ", "d");
        treeMap.put("e", "e");

        treeMap.entrySet().forEach(entry -> {
                    System.out.println(entry.getKey() + "--" + entry.getValue());
                }
        );

        new ArrayList<>().iterator();
        new HashSet<>().iterator();
    }
}
