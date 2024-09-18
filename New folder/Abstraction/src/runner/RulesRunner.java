package runner;

import interface1.*;

public class RulesRunner {
    public static void main(String[] args) {
        // Create an instance of PersonRules implementing all the interfaces
        TrafficRule trafficRule = new TrafficImpli();
        MallRule mallRule = new MallImpli();
        PGRule pgRule = new PgImpli();

        // Invoking methods from TrafficRule interface
        System.out.println("License Number: " + trafficRule.licenceNo());

        // Invoking methods from MallRule interface
        System.out.println("Has valid ID: " + mallRule.validId());

        // Invoking methods from PGRule interface
        System.out.println("PG Cost per Month: " + pgRule.costPerMonth());
        System.out.println("Wi-Fi available: " + pgRule.wifi());
    }
}
