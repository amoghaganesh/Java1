package examples;

public class Service {


    public void saveEmail(String email) throws InvalidEmailException {

        if (!email.contains("@") || !email.contains(".") || !email.endsWith(".com")) {
            throw new InvalidEmailException("Invalid email format: " + email);
        }
        System.out.println("Email saved successfully: " + email);
    }


    public void acceptPrice(double price) {
        if (price <= 100) {
            throw new InvalidPriceException("Price must be above 100. Provided price: " + price);
        }
        System.out.println("Price accepted: " + price);
    }

    public static void main(String[] args) {
        Service service = new Service();


        try {
            service.saveEmail("amoghaganesh23@gmail.com"); // Valid email
            service.saveEmail("ganeshamogh.in");  // Invalid email
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }


        try {
            service.acceptPrice(150);  // Valid price
            service.acceptPrice(90);   // Invalid price
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
    }
}

