import java.util.ArrayList;
import java.util.Iterator;

public class EnhancedForLoop {

    public static void main(String[] args) {
        Object obj = new Object();
        for (Iterator<Object> i = new ArrayList<>().iterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }

    }

}
