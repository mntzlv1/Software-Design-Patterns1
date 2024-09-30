class Logger_task_2 {
    private static Logger_task_2 instance;

    private Logger_task_2() { }

    public static Logger_task_2 getInstance() {
        if (instance == null) {
            instance = new Logger_task_2();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}