package ict.Food.SideDish;

public class WesternDideDish implements ISideDish{
    private String sideDishName;

    public WesternDideDish(String sideDishName) {
        this.sideDishName = sideDishName;
    }

    @Override
    public String getSideDishName() {
        return sideDishName;
    }
    
    
}
