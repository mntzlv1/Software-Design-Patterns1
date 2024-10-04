class House_task_3 {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    private House_task_3(HouseBuilder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    public static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public HouseBuilder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public HouseBuilder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House_task_3 build() {
            return new House_task_3(this);
        }
    }

    @Override
    public String toString() {
        return "House [Rooms=" + numRooms + ", Floors=" + numFloors +
                ", Pool=" + hasPool + ", Garage=" + hasGarage + "]";
    }
}
