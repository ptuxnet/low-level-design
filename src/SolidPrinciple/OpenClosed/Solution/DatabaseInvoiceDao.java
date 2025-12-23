package LowLevelDesign.SolidPrinciple.OpenClosed.Solution;

import LowLevelDesign.SolidPrinciple.SingleResponsibility.Solution.Invoice;

// Concrete implementation for DatabaseInvoiceDao
public class DatabaseInvoiceDao implements InvioceDao {
    Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice) {
        // set the invoice
        this.invoice = invoice;
    }

    @Override
    public void Save() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
}
