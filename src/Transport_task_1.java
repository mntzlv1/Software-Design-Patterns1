interface Transport_task_1 {
    void deliver();
}

class Truck implements Transport_task_1 {
    @Override
    public void deliver() {
        System.out.println("Delivery by land using a Truck.");
    }
}

class Ship implements Transport_task_1 {
    @Override
    public void deliver() {
        System.out.println("Delivery by water using a Ship.");
    }
}

class Drone implements Transport_task_1 {
    @Override
    public void deliver() {
        System.out.println("Delivery by air using a Drone.");
    }
}
