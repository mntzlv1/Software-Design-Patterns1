public class TestSingleton_task_2 {
    public static void main(String[] args) {
        Logger_task_2 logger1 = Logger_task_2.getInstance();
        Logger_task_2 logger2 = Logger_task_2.getInstance();

        logger1.log("This is a singleton logger. Amina Tuzelova (SDP)");

        System.out.println(logger1 == logger2);
    }
}

// SE-2303 Amina Tuzelova (short explanation of task 2)
// it was written by me, in order to give documentation to ensure that my codes are working properly.

// so first of all  i have only one Logger, no matter how many times i will try to use it.
// in private static Logger instance   i have keeped only one logger.
// also i make sure that there is just one logger, If it doesn’t exist, i create it (new Logger()).
// if it’s already made,it just give the same one back.