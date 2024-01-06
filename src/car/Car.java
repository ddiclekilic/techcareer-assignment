package car;

public class Car {
    private int numberOfSeats;
    private String color;
    private FuelType fuelType;
    private double dailyRentalFee;
    private int age;

    public Car(int numberOfSeats, String color, FuelType fuelType, double dailyRentalFee, int age) {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        this.fuelType = fuelType;
        this.dailyRentalFee = dailyRentalFee;
        this.age = age;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyRentalFee() {
        return dailyRentalFee;
    }

    public void setDailyRentalFee(double dailyRentalFee) {
        this.dailyRentalFee = dailyRentalFee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
