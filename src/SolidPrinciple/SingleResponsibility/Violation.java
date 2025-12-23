package LowLevelDesign.SolidPrinciple.SingleResponsibility;

class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

}

// BAD: This class violates SRP by having multiple responsibilities
class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // Responsibility 1: Calculate the total(business logic)
    public void calculateTotal() {
        System.out.println("Calculating total...");
        this.total = this.marker.price * this.quantity;
        System.out.println("Total amount: " + this.total);
    }

    // Responsibility 2: Print the Invoice
    public void printInvoice() {
        // print the Invoice
        System.out.println("Printing Invoice...");
    }

    // Responsibility 3: Database Operations
    public void saveToDB() {
        // Save the data into DB
        System.out.println("Saving to DB...");
    }
}

public class Violation {
    public static void main(String[] args) {
        Marker marker = new Marker("Reynolds", "Blue", 100, 2023);
        Invoice invoice = new Invoice(marker, 5);

        invoice.calculateTotal();
        invoice.printInvoice();
        invoice.saveToDB();
    }
}
