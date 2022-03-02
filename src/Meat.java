import java.io.Serializable;
import java.util.Objects;

public class Meat extends PaleoFood implements Serializable{

    //Create instance variable for type (1 represents animal meat, 2 means seafood) (int).
    //Create accessor/mutator for type.
    //Create instance variable for cookingTemp (the temperature, in Fahrenheit, at which the meat should be cooked before consumption.  Some meat (e.g. seafood) can be eaten raw, which would be 0 for cookingTemp) (int)
    //Create accessor/mutator for cookingTemp
    //Create a constructor with 4 parameters (name, calories, type, cookingTemp).  Initialize all instance variables.  For Meat, the carbohydrates should be initialized to 0 (no carbs).  Carbohydrates should not appear in the constructor parameter list.
    //Override the equals() method to compare all instance variables for equality.
    //Override the toString() method that displays all fields in the following format:
    //"Type: name, calories, carbohydrates, cookingTemp"
    //(If the type is 1 - animal):
    //“Meat: Beef, 650 calories, 0g carbs, 170 degrees F”
    //
    //(If the type is 2 - seafood):
    //"Seafood: Ahi, 300 calories, 0g carbs, 0 degrees F"

    int type, cookingTemp;

    public Meat(String mName, int mCalories, int type, int cookingTemp) {
        super(mName, mCalories, 0);
        this.type = type;
        this.cookingTemp = cookingTemp;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCookingTemp() {
        return cookingTemp;
    }

    public void setCookingTemp(int cookingTemp) {
        this.cookingTemp = cookingTemp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meat meat = (Meat) o;
        return type == meat.type && cookingTemp == meat.cookingTemp;
    }

    @Override
    public String toString() {
        switch(type)
        {
            case 1:
                return "Meat: "
                        + mName
                        + mCalories + " calories,"
                        + mCarbohydrates + "g carbs, "
                        + cookingTemp + " degrees F";
                
            case 2:
                return "Seafood: "
                        + mName
                        + mCalories + " calories,"
                        + mCarbohydrates + "g carbs, "
                        + cookingTemp + " degrees F";
        }
       return "ITS BROKEN";
    }
    //Override the toString() method that displays all fields in the following format:
    //"Type: name, calories, carbohydrates, cookingTemp"
    //(If the type is 1 - animal):
    //“Meat: Beef, 650 calories, 0g carbs, 170 degrees F”
    //
    //(If the type is 2 - seafood):
    //"Seafood: Ahi, 300 calories, 0g carbs, 0 degrees F"
}
