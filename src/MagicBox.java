import java.util.Random;

public class MagicBox<T> {

    protected T item;
    protected T[] items = (T[]) new Object[5];

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Коробка полная, добавить новый предмет не получится!");
        return false;
    }

    public T pick() throws RuntimeException {
        int emptyСells = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                emptyСells += 1;
                throw new BoxNotFullException(emptyСells);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}