package com.xworkz.ball;

public class BallMain {
    public static void main(String[] args) {
        // Creating 3 instances of Ball
        Ball[] balls = {
                new Ball("Red", "Rubber", 22, 500, "Nike", "Soccer", "Outdoor", 120),
                new Ball("White", "Leather", 23, 600, "Adidas", "Basketball", "Indoor", 140),
                new Ball("Blue", "Synthetic", 21, 450, "Puma", "Volleyball", "Indoor/Outdoor", 130)
        };

        // Setting additional properties using methods
        for (Ball ball : balls) {
            ball.setSurface("Smooth");
            ball.setPattern("Stripes");
            ball.setSport("Soccer");
            ball.setCountryOfOrigin("USA");
            ball.setPressure(15);
            ball.setCertification("FIFA Approved");
            ball.setLeague("Premier League");
            ball.setDurability(1000);
            ball.setGrip("High");
            ball.setVisibility("High");
            ball.setWaterResistant(true);
            ball.setLogo("Official");
            ball.setStitching("Double");
            ball.setAirRetention(30);
            ball.setIndoorOutdoor(true);
            ball.setRecommendedTemperature("15-25C");
            ball.setStorageInstructions(10);
        }

        // Looping through the array and invoking the print method
        for (int i = 0; i < balls.length; i++) {
            balls[i].printDetails();
        }
    }
}
