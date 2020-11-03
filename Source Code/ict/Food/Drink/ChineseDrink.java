package ict.Food.Drink;

public class ChineseDrink implements IDrink{
    private String drinkName;

    public ChineseDrink(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String getDrinkName() {
        return drinkName;
    }
    
}
