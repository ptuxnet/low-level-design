package LowLevelDesign.SolidPrinciple.OpenClosed.Solution;

import LowLevelDesign.SolidPrinciple.SingleResponsibility.Solution.Invoice;

// Concrete implementation for FileInvoiceDao
// NEW File Save Operation: An extension without modification!
public class FileInvoiceDao implements InvioceDao {

    Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        // set the invoice
        this.invoice = invoice;
    }

    @Override
    public void Save() {
        // Save into the file the invoice
        System.out.println("Saving to file...");
    }
}
