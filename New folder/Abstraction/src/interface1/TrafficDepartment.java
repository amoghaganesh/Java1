package interface1;

public class TrafficDepartment {

    public TrafficRule trafficRule;

    // Setter method to inject TrafficRule implementation
    public void setTrafficRule(TrafficRule trafficRule) {
        this.trafficRule = trafficRule;
    }

    // Static method to check if TrafficRule is not null and invoke licenceNo method
    public static void check(TrafficRule trafficRule) {
        System.out.println("Running Traffic Check");
        if (trafficRule != null) {
            System.out.println("TrafficRule is not null");
            System.out.println("License Number: " + trafficRule.licenceNo());
        } else {
            System.out.println("TrafficRule is null");
        }
    }
}
