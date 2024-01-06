import car.FuelType;
import car.Hatchback;
import car.SUV;
import car.Sedan;
import user.Role;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dicle", "example@gmail.com", Role.INDIVIDUAL);
        User user2 = new User("Company", "example2@gmail.com", Role.COMPANY);
        Sedan sedan2 = new Sedan(5, "Black", FuelType.LPG, 250, 2);
        Hatchback hatchback = new Hatchback(5, "Black", FuelType.DIESEL, 300, 1);
        Hatchback hatchback2 = new Hatchback(5, "Black", FuelType.GASOLINE, 90, 5);
        SUV suv = new SUV(5, "Black", FuelType.LPG, 170, 3);
        user.rentACarDaily(hatchback);
        user2.rentACarDaily(sedan2);
        user.rentACarDaily(suv);
        user2.rentACarMonthly(hatchback2);
        user.rentACarMonthly(hatchback);
        user.rentACarMonthly(sedan2);
    }
}