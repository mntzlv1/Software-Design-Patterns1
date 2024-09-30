public class TestFactoryMethod_task_1 {
    public static void main(String[] args) {
        TransportFactory_task_1 factory = new WaterTransportFactory();
        factory.createTransport().deliver();
    }
}



//  SE-2303 Amina Tuzelova (short explanation of task 1)
// it was written by me, in order to give documentation to ensure that my codes are working properly.

// for this task i have created interface with delivery() method.
// also i created 3 classes such as: Truck, Ship, Drone and abstract class named TransportFactory_task_1 which have createTransport method that helps me to define in subclasses.
// so after that  Factory Method  Pattern  makes it easy to choose right delivery method, without to manage them directly.