package car;

import car.services.IDailyRental;
import car.services.IMonthlyRental;

public class Sedan extends Car implements IDailyRental, IMonthlyRental {

    public Sedan(int numberOfSeats, String color, FuelType fuelType, double dailyRentalFee, int age) {
        super(numberOfSeats, color, fuelType, dailyRentalFee, age);
    }

    @Override
    public double calculateDailyRentalFee() {
        if (this.getAge() < 3)
            return (this.getDailyRentalFee() * this.getAge()) + 150;
        else
            return (this.getDailyRentalFee() * this.getAge()) + 50;
    }

    @Override
    public double calculateMonthlyRentalFee() {
        return 30 * this.getDailyRentalFee();
    }
}
