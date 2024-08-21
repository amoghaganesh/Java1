public class PlantMain {
    public static void main(String[] args) {
        // Creating 3 instances of Plant
        Plant[] plants = {
            new Plant("Rose", "Flower", 50, 2, "Red"),
            new Plant("Oak", "Tree", 1000, 100, "Brown"),
            new Plant("Cactus", "Succulent", 20, 5, "Green")
        };

        // Setting additional properties using methods
        plants[0].setClimate("Temperate");
        plants[0].setSoilType("Loamy");
        plants[0].setFlowering(true);
        plants[0].setWaterRequirements(500);
        plants[0].setSunlightExposure("Full Sun");

        plants[1].setClimate("Temperate");
        plants[1].setSoilType("Clay");
        plants[1].setFlowering(false);
        plants[1].setWaterRequirements(1000);
        plants[1].setSunlightExposure("Partial Sun");

        plants[2].setClimate("Arid");
        plants[2].setSoilType("Sandy");
        plants[2].setFlowering(true);
        plants[2].setWaterRequirements(100);
        plants[2].setSunlightExposure("Full Sun");

        // Looping through the array and invoking the print method
        for (int i = 0; i < plants.length; i++) {
            plants[i].printDetails();
        }
    }
}