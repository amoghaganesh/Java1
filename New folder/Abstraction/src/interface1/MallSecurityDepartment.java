package interface1;

public class MallSecurityDepartment {

    public MallRule mallRule;

    // Setter method to inject MallRule implementation
    public void setMallRule(MallRule mallRule) {
        this.mallRule = mallRule;
    }

    // Static method to check if MallRule is not null and invoke validId method
    public static void check(MallRule mallRule) {
        System.out.println("Running Mall Security Check");
        if (mallRule != null) {
            System.out.println("MallRule is not null");
            System.out.println("Has valid ID: " + mallRule.validId());
        } else {
            System.out.println("MallRule is null");
        }
    }
}
