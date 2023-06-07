package Charpter11;

public class food {
    private int numberOfSpoon;
    private boolean withFood;

    public food(int amount, boolean withFood) {
        this.withFood = withFood;
        int pricePerSpoon = 100;
        numberOfSpoon = amount / pricePerSpoon;
    }

    @Override
    public String toString() {
        String response = String.format("""
                %s spoon(s) of hot food %s food""", numberOfSpoon, withFood ? "with" : "without");

        return  null;
    }

}

