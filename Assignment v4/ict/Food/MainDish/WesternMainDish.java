package ict.Food.MainDish;

public class WesternMainDish implements IMainDish{
    private String mainDishName;

    public WesternMainDish(String mainDishName) {
        this.mainDishName = mainDishName;
    }

    @Override
    public String getMainDishName() {
        return mainDishName;
    }
    
}
