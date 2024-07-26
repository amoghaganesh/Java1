public class BusNumbers {
    public static void main(String[] args) {
        String[] busNumbers = new String[5];
        busNumbers[0] = "KA-01-EF-1234";
        busNumbers[1] = "KA-12-PL-5678";
        busNumbers[2] = "KA-04-OX-9012";
        busNumbers[3] = "KA-34-AE-3456";
        busNumbers[4] = "KA-17-ES-7890";

        for (int i = busNumbers.length - 1; i >= 0; i--) {
            System.out.println(busNumbers[i]);
        }
    }
}
