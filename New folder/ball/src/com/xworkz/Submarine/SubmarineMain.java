package com.xworkz.Submarine;

public class SubmarineMain {

    public static void main(String[] args) {
        // Creating 3 instances of Submarine
        Submarine[] submarines = {
                new Submarine("Nautilus", "Attack", 70, 135, 500),
                new Submarine("Seawolf", "Nuclear", 100, 140, 600),
                new Submarine("Typhoon", "Ballistic", 175, 160, 800)
        };

        // Setting additional properties using methods
        for (Submarine sub : submarines) {
            sub.setPropulsion("Nuclear");
            sub.setSpeed(30);
            sub.setArmament("Torpedoes");
            sub.setLaunchYear(1997);
            sub.setCountryOfOrigin("USA");
            sub.setDisplacement(9000);
            sub.setEndurance(90);
            sub.setMaterial("Steel");
            sub.setHullShape("Cylindrical");
            sub.setSonarRange(20);
            sub.setNuclearPowered(true);
            sub.setTorpedoCount(24);
            sub.setRadarSystem("Advanced Radar");
            sub.setMissileRange(1000);
            sub.setCommunicationSystem("Satellite");
            sub.setFuelCapacity(100000);
            sub.setPowerOutput(50);
            sub.setNavigationSystem("GPS");
            sub.setStealthTechnology(true);
            sub.setOperatingDepth(500);
            sub.setPrimaryMission("Patrol");
            sub.setBuildCost(2000);
            sub.setConstructor("Naval Shipyard");
            sub.setServiceLife(30);
            sub.setEquippedWithAUV(true);
            sub.setMaxCrewDepth(600);
            sub.setSurfaceSpeed(35);
            sub.setDiveType("Nuclear Dive");
            sub.setOxygenCapacity(24);
            sub.setSpecialFeatures("Stealth Mode");
            sub.setHasRescueChamber(true);
            sub.setMaxTorpedoSpeed(50);
            sub.setElectronicWarfareCapability(80);
            sub.setAntiSubmarineWarfare(true);
        }

        // Looping through the array and invoking the print method
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].printDetails();
        }
    }
}
