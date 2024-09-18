package com.xworkz.ball;

public class Ball {
        // 25 instance variables
        String color;
        String material;
        int diameter;
        int weight;
        String brand;
        String type;
        String usage;
        int bounceHeight;
        String surface;
        String pattern;
        String sport;
        String countryOfOrigin;
        int pressure;
        String certification;
        String league;
        int durability;
        String grip;
        String visibility;
        boolean waterResistant;
        String logo;
        String stitching;
        int airRetention;
        boolean indoorOutdoor;
        String recommendedTemperature;
        int storageInstructions;

        // Constructor initializing 8 variables
        public Ball(String color, String material, int diameter, int weight, String brand, String type, String usage, int bounceHeight) {
            this.color = color;
            this.material = material;
            this.diameter = diameter;
            this.weight = weight;
            this.brand = brand;
            this.type = type;
            this.usage = usage;
            this.bounceHeight = bounceHeight;
        }

        // Methods to set the remaining 17 variables
        public void setSurface(String surface) {
            this.surface = surface;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }

        public void setCountryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public void setCertification(String certification) {
            this.certification = certification;
        }

        public void setLeague(String league) {
            this.league = league;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        public void setGrip(String grip) {
            this.grip = grip;
        }

        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        public void setWaterResistant(boolean waterResistant) {
            this.waterResistant = waterResistant;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public void setStitching(String stitching) {
            this.stitching = stitching;
        }

        public void setAirRetention(int airRetention) {
            this.airRetention = airRetention;
        }

        public void setIndoorOutdoor(boolean indoorOutdoor) {
            this.indoorOutdoor = indoorOutdoor;
        }

        public void setRecommendedTemperature(String recommendedTemperature) {
            this.recommendedTemperature = recommendedTemperature;
        }

        public void setStorageInstructions(int storageInstructions) {
            this.storageInstructions = storageInstructions;
        }

        // Method to print the variables
        public void printDetails() {
            System.out.println("Ball: Color: " + color + ", Material: " + material + ", Diameter: " + diameter + " cm, Weight: " + weight + " g, Brand: " + brand +
                    ", Type: " + type + ", Usage: " + usage + ", Bounce Height: " + bounceHeight + " cm, Surface: " + surface +
                    ", Pattern: " + pattern + ", Sport: " + sport + ", Country of Origin: " + countryOfOrigin +
                    ", Pressure: " + pressure + " psi, Certification: " + certification + ", League: " + league +
                    ", Durability: " + durability + ", Grip: " + grip + ", Visibility: " + visibility + ", Water Resistant: " + waterResistant +
                    ", Logo: " + logo + ", Stitching: " + stitching + ", Air Retention: " + airRetention +
                    ", Indoor/Outdoor: " + indoorOutdoor + ", Recommended Temperature: " + recommendedTemperature +
                    ", Storage Instructions: " + storageInstructions);
        }
    }



