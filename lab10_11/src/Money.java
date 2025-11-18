public enum Money {
    DOLLARS_ONE(1),
    DOLLARS_FIVE(5),
    DOLLARS_TEN(10),
    COINS_FIVE(5);

    private int value;

    Money(int value) {
        this.value = value;
    }
}
