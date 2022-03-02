import java.io.Serializable;
import java.util.Objects;

public abstract class PaleoFood implements Serializable {
    ///Create instance variables for name (String), calories (int) and carbohydrates (int).
    // **Be sure that all instance variables can be inherited by the two child classes**
    //Create accessors/mutators for all instance variables.
    protected String mName;
    protected int mCalories, mCarbohydrates;

    protected PaleoFood(String mName, int mCalories, int mCarbohydrates) {
        this.mName = mName;
        this.mCalories = mCalories;
        this.mCarbohydrates = mCarbohydrates;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getCalories() {
        return mCalories;
    }

    public void setCalories(int mCalories) {
        this.mCalories = mCalories;
    }

    public int getCarbohydrates() {
        return mCarbohydrates;
    }

    public void setCarbohydrates(int mCarbohydrates) {
        this.mCarbohydrates = mCarbohydrates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaleoFood paleoFood = (PaleoFood) o;
        return mCalories == paleoFood.mCalories && mCarbohydrates == paleoFood.mCarbohydrates && Objects.equals(mName, paleoFood.mName);
    }


}
