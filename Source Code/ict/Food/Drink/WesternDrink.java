package ict.Food.Drink;

public class WesternDrink implements IDrink{
    private String drinkName;

    public WesternDrink(String drinkName) {
        this.drinkName = drinkName;
    }
    
    @Override
    public String getDrinkName() {
        return drinkName;
    }

    
}
