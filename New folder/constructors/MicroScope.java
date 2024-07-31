public class MicroScope {
    int magnification;
    String typeOfMicroscope;
    String brand;
    String lightSource;

    public static void main(String[] args) {
        MicroScope microscope1 = new MicroScope();
        microscope1.magnification = 1000;
        microscope1.typeOfMicroscope = "Compound";
        microscope1.brand = "Olympus";
        microscope1.lightSource = "LED";

        MicroScope microscope2 = new MicroScope();
        microscope2.magnification = 400;
        microscope2.typeOfMicroscope = "Stereo";
        microscope2.brand = "Nikon";
        microscope2.lightSource = "Halogen";

        MicroScope microscope3 = new MicroScope();
        microscope3.magnification = 1500;
        microscope3.typeOfMicroscope = "Digital";
        microscope3.brand = "Leica";
        microscope3.lightSource = "LED";

        MicroScope microscope4 = new MicroScope();
        microscope4.magnification = 100;
        microscope4.typeOfMicroscope = "Pocket";
        microscope4.brand = "Carson";
        microscope4.lightSource = "LED";

        MicroScope microscope5 = new MicroScope();
        microscope5.magnification = 600;
        microscope5.typeOfMicroscope = "Biological";
        microscope5.brand = "AmScope";
        microscope5.lightSource = "Halogen";

        MicroScope microscope6 = new MicroScope();
        microscope6.magnification = 1200;
        microscope6.typeOfMicroscope = "Electron";
        microscope6.brand = "Hitachi";
        microscope6.lightSource = "Electron Gun";

        MicroScope microscope7 = new MicroScope();
        microscope7.magnification = 500;
        microscope7.typeOfMicroscope = "Inverted";
        microscope7.brand = "Zeiss";
        microscope7.lightSource = "LED";

        System.out.println("Microscope 1: " + microscope1.magnification + "x, " + microscope1.typeOfMicroscope + ", " + microscope1.brand + ", " + microscope1.lightSource);
        System.out.println("Microscope 2: " + microscope2.magnification + "x, " + microscope2.typeOfMicroscope + ", " + microscope2.brand + ", " + microscope2.lightSource);
        System.out.println("Microscope 3: " + microscope3.magnification + "x, " + microscope3.typeOfMicroscope + ", " + microscope3.brand + ", " + microscope3.lightSource);
        System.out.println("Microscope 4: " + microscope4.magnification + "x, " + microscope4.typeOfMicroscope + ", " + microscope4.brand + ", " + microscope4.lightSource);
        System.out.println("Microscope 5: " + microscope5.magnification + "x, " + microscope5.typeOfMicroscope + ", " + microscope5.brand + ", " + microscope5.lightSource);
        System.out.println("Microscope 6: " + microscope6.magnification + "x, " + microscope6.typeOfMicroscope + ", " + microscope6.brand + ", " + microscope6.lightSource);
        System.out.println("Microscope 7: " + microscope7.magnification + "x, " + microscope7.typeOfMicroscope + ", " + microscope7.brand + ", " + microscope7.lightSource);
    }
}
