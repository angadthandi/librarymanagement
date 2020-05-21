package modules.library;

public enum ReservationStatus {
    WAITING(0),
    PENDING(1),
    COMPLETED(2),
    CANCELLED(3);

    private int value;

    private ReservationStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}