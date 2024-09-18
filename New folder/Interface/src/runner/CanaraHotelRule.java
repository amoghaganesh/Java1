package runner;

import bcci.HotelRules;

public class CanaraHotelRule implements HotelRules {

    @Override
    public boolean cleanPremises() {

        return true;
    }
}
