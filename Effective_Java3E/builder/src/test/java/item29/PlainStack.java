package item29;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class PlainStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public PlainStack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object object) {
        ensureCapacity();
        elements[size++] = object;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();

        Object result = elements[--size];
        elements[size] = null; // 다 쓴 객체 참조 해제ㅓㅓㅓjj
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
