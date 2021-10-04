package vol1.chapter13;

public class Exercise {
    public static void main(String[] args) {

    }
}


interface List{
    public void add();
    public void update(int idx, Object value);
    public void remove(int index);
}

abstract class AbstractList implements List {
    abstract void clear();
}
