package car;

import car.services.IDailyRental;
import car.services.IMonthlyRental;

public class Hatchback extends Car implements IDailyRental, IMonthlyRental {

    public Hatchback(int numberOfSeats, String color, FuelType fuelType, double dailyRentalFee, int age) {
        super(numberOfSeats, color, fuelType, dailyRentalFee, age);
    }

    @Override
    public double calculateDailyRentalFee() {
        return (this.getDailyRentalFee() * this.getAge()) - 10;
    }

    @Override
    public double calculateMonthlyRentalFee() {
        return 30 * this.getDailyRentalFee();
    }
}
