package com.xworkz.Submarine;

public class Submarine {

    String name;
    String type;
    int length;
    int crewCapacity;
    int maxDepth;
    String propulsion;
    int speed;
    String armament;
    int launchYear;
    String countryOfOrigin;
    int displacement;
    int endurance;
    String material;
    String hullShape;
    int sonarRange;
    boolean nuclearPowered;
    int torpedoCount;
    String radarSystem;
    int missileRange;
    String communicationSystem;
    int fuelCapacity;
    int powerOutput;
    String navigationSystem;
    boolean stealthTechnology;
    int operatingDepth;
    String primaryMission;
    int buildCost;
    String constructor;
    int serviceLife;
    boolean equippedWithAUV;
    int maxCrewDepth;
    int surfaceSpeed;
    String diveType;
    int oxygenCapacity;
    String specialFeatures;
    boolean hasRescueChamber;
    int maxTorpedoSpeed;
    int electronicWarfareCapability;
    boolean antiSubmarineWarfare;

    // Constructor initializing 5 variables
    public Submarine(String name, String type, int length, int crewCapacity, int maxDepth) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.crewCapacity = crewCapacity;
        this.maxDepth = maxDepth;
    }

    // Methods to set the remaining 35 variables
    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHullShape(String hullShape) {
        this.hullShape = hullShape;
    }

    public void setSonarRange(int sonarRange) {
        this.sonarRange = sonarRange;
    }

    public void setNuclearPowered(boolean nuclearPowered) {
        this.nuclearPowered = nuclearPowered;
    }

    public void setTorpedoCount(int torpedoCount) {
        this.torpedoCount = torpedoCount;
    }

    public void setRadarSystem(String radarSystem) {
        this.radarSystem = radarSystem;
    }

    public void setMissileRange(int missileRange) {
        this.missileRange = missileRange;
    }

    public void setCommunicationSystem(String communicationSystem) {
        this.communicationSystem = communicationSystem;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public void setNavigationSystem(String navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public void setStealthTechnology(boolean stealthTechnology) {
        this.stealthTechnology = stealthTechnology;
    }

    public void setOperatingDepth(int operatingDepth) {
        this.operatingDepth = operatingDepth;
    }

    public void setPrimaryMission(String primaryMission) {
        this.primaryMission = primaryMission;
    }

    public void setBuildCost(int buildCost) {
        this.buildCost = buildCost;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public void setServiceLife(int serviceLife) {
        this.serviceLife = serviceLife;
    }

    public void setEquippedWithAUV(boolean equippedWithAUV) {
        this.equippedWithAUV = equippedWithAUV;
    }

    public void setMaxCrewDepth(int maxCrewDepth) {
        this.maxCrewDepth = maxCrewDepth;
    }

    public void setSurfaceSpeed(int surfaceSpeed) {
        this.surfaceSpeed = surfaceSpeed;
    }

    public void setDiveType(String diveType) {
        this.diveType = diveType;
    }

    public void setOxygenCapacity(int oxygenCapacity) {
        this.oxygenCapacity = oxygenCapacity;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public void setHasRescueChamber(boolean hasRescueChamber) {
        this.hasRescueChamber = hasRescueChamber;
    }

    public void setMaxTorpedoSpeed(int maxTorpedoSpeed) {
        this.maxTorpedoSpeed = maxTorpedoSpeed;
    }

    public void setElectronicWarfareCapability(int electronicWarfareCapability) {
        this.electronicWarfareCapability = electronicWarfareCapability;
    }

    public void setAntiSubmarineWarfare(boolean antiSubmarineWarfare) {
        this.antiSubmarineWarfare = antiSubmarineWarfare;
    }

    // Method to print the variables
    public void printDetails() {
        System.out.println("Submarine: Name: " + name + ", Type: " + type + ", Length: " + length + " m, Crew Capacity: " + crewCapacity +
                ", Max Depth: " + maxDepth + " m, Propulsion: " + propulsion + ", Speed: " + speed + " knots, Armament: " + armament +
                ", Launch Year: " + launchYear + ", Country of Origin: " + countryOfOrigin + ", Displacement: " + displacement + " tons, Endurance: " + endurance +
                " days, Material: " + material + ", Hull Shape: " + hullShape + ", Sonar Range: " + sonarRange + " km, Nuclear Powered: " + nuclearPowered +
                ", Torpedo Count: " + torpedoCount + ", Radar System: " + radarSystem + ", Missile Range: " + missileRange + " km, Communication System: " + communicationSystem +
                ", Fuel Capacity: " + fuelCapacity + " liters, Power Output: " + powerOutput + " MW, Navigation System: " + navigationSystem +
                ", Stealth Technology: " + stealthTechnology + ", Operating Depth: " + operatingDepth + " m, Primary Mission: " + primaryMission +
                ", Build Cost: $" + buildCost + " million, Constructor: " + constructor + ", Service Life: " + serviceLife + " years, Equipped With AUV: " + equippedWithAUV +
                ", Max Crew Depth: " + maxCrewDepth + " m, Surface Speed: " + surfaceSpeed + " knots, Dive Type: " + diveType + ", Oxygen Capacity: " + oxygenCapacity + " hours" +
                ", Special Features: " + specialFeatures + ", Has Rescue Chamber: " + hasRescueChamber + ", Max Torpedo Speed: " + maxTorpedoSpeed + " km/h" +
                ", Electronic Warfare Capability: " + electronicWarfareCapability + ", Anti-Submarine Warfare: " + antiSubmarineWarfare);
    }
}
