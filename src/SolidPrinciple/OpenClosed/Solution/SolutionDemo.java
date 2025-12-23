package LowLevelDesign.SolidPrinciple.OpenClosed.Solution;

import LowLevelDesign.SolidPrinciple.SingleResponsibility.Solution.Invoice;
import LowLevelDesign.SolidPrinciple.SingleResponsibility.Solution.Marker;

// Usage demonstrating OCP compliance
public class SolutionDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
        invoice.calculateTotal();

        DatabaseInvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.Save(); // Save to DB

        FileInvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.Save(); // Save to File
        // The system is:
        // - OPEN for extension (new save functions can be added)
        // - CLOSED for modification (existing code remains unchanged)
    }
}
