package runner;

import bcci.FoodSafetyDepartment;
import bcci.HotelRules;

public class HotelRunner {
    public static void main(String[] args) {
        HotelRules hotelRules=new CanaraHotelRule();
        FoodSafetyDepartment foodSafetyDepartment=new FoodSafetyDepartment();
        CanaraHotelRule canaraHotelRule=new CanaraHotelRule();
        FoodSafetyDepartment.check();
    }
}
