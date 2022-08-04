public class BoxNotFullException extends RuntimeException {

    public BoxNotFullException(int emptyСells) {
        super("Коробка неполная, осталось ещё " + emptyСells + " яч.");
    }
}