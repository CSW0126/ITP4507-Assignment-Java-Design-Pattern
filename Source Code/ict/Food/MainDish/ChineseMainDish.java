package ict.Food.MainDish;

public class ChineseMainDish implements IMainDish{
    private String mainDishName;

    public ChineseMainDish(String mainDishName) {
        this.mainDishName = mainDishName;
    }

    @Override
    public String getMainDishName() {
        return mainDishName;
    }
}
