package enums;

public enum Coffee {
    AMERICANO("крепкий"), CAPPUCCINO("С водой"),
    ESPRESSO("с молоком"), LATTE("Молочный");

    private final String characteristic;
    Coffee(String characteristic){
        this.characteristic = characteristic;
    }
    public String getCharacteristic(){
        return characteristic;
    }


    @Override
    public String toString() {
        return super.toString() +" "+ characteristic;
    }
}
