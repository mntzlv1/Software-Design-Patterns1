public class TestFactoryMethod_task_1 {
    public static void main(String[] args) {
        TransportFactory_task_1 factory = new WaterTransportFactory();
        factory.createTransport().deliver();
    }
}
