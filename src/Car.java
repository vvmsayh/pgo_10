import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Car implements Comparable<Car> {
    private String modelName;
    private int yearOfManufacture;

    public Car(String modelName, int yearOfManufacture) {
        this.modelName = modelName;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.yearOfManufacture, other.yearOfManufacture);
    }
    @Override
    public String toString() {
        return modelName + " (" + yearOfManufacture + ")";
    }
}
