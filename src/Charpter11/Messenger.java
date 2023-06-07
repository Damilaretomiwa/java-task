package Charpter11;

public class Messenger {
    public static Food buyFoodFromBright(int amount, boolean withFood, boolean moneyIsFake) {
        return callBright(amount, withFood, moneyIsFake);
    }

    public static Food buyFoodFromJoy(int amount, boolean withFood, boolean moneyIsFake) {
        return callJoy(amount, withFood, moneyIsFake);
    }

    public static Food buyFoodFromMichael(int amount, boolean withFood, boolean moneyIsFake) {
        return callMichael(amount, withFood, moneyIsFake);
    }

    public static Food buyFood(int amount, boolean withFood, boolean moneyIsFake) {
        if (moneyIsFake) {
            throw new IllegalArgumentException("Money is fake!");
        }

        Food food = new Food(amount, withFood);
        return food;
    }

    private static Food callBright(int amount, boolean withFood, boolean moneyIsFake) {
        // Implementation of the callBright method
        // Replace null with the actual implementation
        return buyFoodFromMichael(899,true,false);
    }

    private static Food callJoy(int amount, boolean withFood, boolean moneyIsFake) {
        // Implementation of the callJoy method
        // Replace null with the actual implementation
        return null;
    }

    private static Food callMichael(int amount, boolean withFood, boolean moneyIsFake) {
        // Implementation of the callMichael method
        // Replace null with the actual implementation
        return null;
    }

    private static class Food {
        private int amount;
        private boolean withFood;

        public Food(int amount, boolean withFood) {
            this.amount = amount;
            this.withFood = withFood;
        }
    }
}
