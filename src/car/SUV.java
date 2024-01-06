package car;

import car.services.IDailyRental;

public class SUV extends Car implements IDailyRental {

    public SUV(int numberOfSeats, String color, FuelType fuelType, double dailyRentalFee, int age) {
        super(numberOfSeats, color, fuelType, dailyRentalFee, age);
    }

    @Override
    public double calculateDailyRentalFee() {
        return (this.getDailyRentalFee() * this.getAge()) + 120;
    }
}
