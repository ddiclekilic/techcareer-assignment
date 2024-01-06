package user;

import car.Hatchback;
import car.services.IDailyRental;
import car.services.IMonthlyRental;

public class User {
    private String name;
    private String email;
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public User(String name, String email, Role role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public void rentACarDaily(IDailyRental car){
        if(this.getRole().equals(Role.INDIVIDUAL) && !(car instanceof Hatchback)){
            System.out.println("Individual users cannot rent car types other than Hatchback.");
        }else{
            System.out.println("Daily rental fee: " + car.calculateDailyRentalFee());
        }
    }
    public void rentACarMonthly(IMonthlyRental car){
        if(this.getRole().equals(Role.INDIVIDUAL) && !(car instanceof Hatchback)){
            System.out.println("Individual users cannot rent car types other than Hatchback.");
        }else{
            System.out.println("Monthly rental fee: " + car.calculateMonthlyRentalFee());
        }
    }
}
