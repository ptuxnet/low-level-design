package LowLevelDesign.SolidPrinciple.InterfaceSegregation.violation;

// Usage example - showing the problem
public class ViolationDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        // Works fine for Waiter role
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        // These will throw exceptions
        waiter.prepareFood(); // forced implementation
        waiter.decideMenu(); // forced implementation
        waiter.cleanTheKitchen(); // forced implementation
    }
}
