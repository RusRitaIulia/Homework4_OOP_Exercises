package exercise2;

public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPrintedPages());
        int pagesPrinted = printer.print(16);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count = " + printer.getPrintedPages());
        pagesPrinted = printer.print(8);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count = " + printer.getPrintedPages());
    }
}
