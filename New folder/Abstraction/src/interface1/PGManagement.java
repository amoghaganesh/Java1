package interface1;

public class PGManagement {

    public PGRule pgRule;

    // Setter method to inject PGRule implementation
    public void setPGRule(PGRule pgRule) {
        this.pgRule = pgRule;
    }

    // Static method to check if PGRule is not null and invoke costPerMonth and wifi methods
    public static void check(PGRule pgRule) {
        System.out.println("Running PG Management Check");
        if (pgRule != null) {
            System.out.println("PGRule is not null");
            System.out.println("Cost per month: " + pgRule.costPerMonth());
            System.out.println("Wi-Fi available: " + pgRule.wifi());
        } else {
            System.out.println("PGRule is null");
        }
    }
}
