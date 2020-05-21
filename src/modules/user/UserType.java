package modules.user;

public enum UserType {
    ADMIN(0),
    LIBRARIAN(1),
    MEMBER(2);

    private int value;

    private UserType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}