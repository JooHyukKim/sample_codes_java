import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Item28 {

    @Test
    public void test() {
        assertThrows(ArrayStoreException.class, () -> {
            Object[] objectArr = new Long[1];
            objectArr[0] = "타입이 달라 넣을 수 없다"; // ArrayStroeException 을 던진다.
        });

//        List<Object> ol = new ArrayList<Long>();
//        ol.add("타입이 달라 넣을 수 없다.");

    }
}
