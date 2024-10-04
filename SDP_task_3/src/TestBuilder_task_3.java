public class TestBuilder_task_3 {
    public static void main(String[] args) {
        House_task_3 house = new House_task_3.HouseBuilder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}

//  SE-2303 Amina Tuzelova (short explanation of task 1)
// it was written by me, in order to give documentation to ensure that my codes are working properly.

// for this task i used builder pattern to make a House with different options.
// the House_task_3 class has private rooms, floors, pool, and garage.
// i use methods like setNumRooms() and setHasPool() to set up what i need.
// also the build() method creates the House_task_3 object.
