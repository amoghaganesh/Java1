package loose_coupling.printersystem;

public class PrintManager {
    private Printer printer;

    PrintManager(Printer printer) {
        this.printer = printer;
    }

    void startPrint() {
        printer.print();
    }
}
