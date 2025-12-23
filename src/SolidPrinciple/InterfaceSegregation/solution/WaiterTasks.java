package LowLevelDesign.SolidPrinciple.InterfaceSegregation.solution;

// GOOD: This follows ISP - Multiple focused interfaces following ISP
public interface WaiterTasks {
    void serveFoodAndDrinks();

    void takeOrder();
}
