package LowLevelDesign.SolidPrinciple.SingleResponsibility.Solution;

// Responsibility 3: Printing the Invoice only
public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
        System.out.println("InvoicePrinter created...");

    }

    public void print() {
        // print the invoice
        System.out.println("Printing Invoice...");
        invoice.calculateTotal();
    }
}
