class Task_5Factory_task_5 implements GUIFactory_task_5 {
    private String platform;

    public Task_5Factory_task_5(String platform) {
        this.platform = platform;
    }

    public Button_task_5 createButton() {
        return platform.equals("Windows") ? new Task_5WindowsButton_task_5() : new Task_5MacButton_task_5();
    }

    public Window_task_5 createWindow() {
        return platform.equals("Windows") ? new Task_5WindowsWindow_task_5() : new Task_5MacWindow_task_5();
    }
}