package dto;

public class MallDTO {
    class MallDT {
        private int id;
        private String name;
        private Location location;
        private String owner;
        private double landDimension;
    }

    enum Location {
        CITY_CENTER,
        SUBURB,
        DOWNTOWN,
        INDUSTRIAL_AREA
    }
}
