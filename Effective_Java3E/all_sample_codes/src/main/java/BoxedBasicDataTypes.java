import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BoxedBasicDataTypes {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a", "b");
        map.put("a", "b");

        for (Map.Entry entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
