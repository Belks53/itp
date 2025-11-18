public enum Drinks {
        COKECOLA(5, "Coke Cola"),
        SPRITE(7, "Speite"),
        FANTA(9, "Fanta"),;

        private final int price;
        private final String name;

        Drinks(int price, String name) {
            this.price = price;
            this.name = name;
        }
}
