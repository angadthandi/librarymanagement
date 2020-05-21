package modules.book;

public enum BookStatus {
    AVAILABLE(0),
    RESERVED(1),
    LOST(2);

    private int value;

    private BookStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}