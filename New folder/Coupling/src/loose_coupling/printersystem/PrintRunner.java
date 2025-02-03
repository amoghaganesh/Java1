package loose_coupling.printersystem;

public class PrintRunner {
    public static void main(String[] args) {
        Printer printer = new InkjetPrinter();
        PrintManager pm = new PrintManager(printer);
        pm.startPrint();
    }
}
