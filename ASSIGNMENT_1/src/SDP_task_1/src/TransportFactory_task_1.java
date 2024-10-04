abstract class TransportFactory_task_1 {
    public abstract Transport_task_1 createTransport();
}

class LandTransportFactory extends TransportFactory_task_1 {
    @Override
    public Transport_task_1 createTransport() {
        return new Truck();
    }
}

class WaterTransportFactory extends TransportFactory_task_1 {
    @Override
    public Transport_task_1 createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends       TransportFactory_task_1 {
    @Override
    public Transport_task_1 createTransport() {
        return new Drone();
    }
}