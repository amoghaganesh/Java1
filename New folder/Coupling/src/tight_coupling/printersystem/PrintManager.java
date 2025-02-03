package tight_coupling.printersystem;

public class PrintManager {
    InkjetPrinter printer = new InkjetPrinter(); // Tight coupling

    void startPrint() {
        printer.print();
    }
}
