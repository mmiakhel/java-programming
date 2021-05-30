package day46_encapsulation;

public class Car {
    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }

    //setter method for year
    public void setYear(int year) {
        this.year = year;
    }
    //getter method for year
    public int getYear() {
        return year;
    }

    //getter setter method for mileage
    //generate toString
    public int getMileage() {
        return mileage; //this.mileage; <- also works fine

    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
