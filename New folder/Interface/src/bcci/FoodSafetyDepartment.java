package bcci;

public class FoodSafetyDepartment {

    public HotelRules hotelRules;
    public void setHotelRules(HotelRules hotelRules){

        this.hotelRules=hotelRules;
    }
    public static void check(){

        System.out.println("running check");
        if(hotelRules != null){
            System.out.println("hotelrule not null");
            hotelRules.cleanPremises();
        }else{
            System.out.println("hotelrule ");
        }
    }

}
