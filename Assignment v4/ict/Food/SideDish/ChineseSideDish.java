package ict.Food.SideDish;

public class ChineseSideDish implements ISideDish {
    private String sideDishName;

    public ChineseSideDish(String sideDishName) {
        this.sideDishName = sideDishName;
    }

    @Override
    public String getSideDishName() {
        return sideDishName;
    }

}
