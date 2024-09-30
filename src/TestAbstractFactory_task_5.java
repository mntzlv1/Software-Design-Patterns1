public class TestAbstractFactory_task_5 {
    public static void main(String[] args) {
        GUIFactory_task_5 factory = new Task_5Factory_task_5("Windows");
        factory.createButton().click();
        factory.createWindow().open();
    }
}

//  SE-2303 Amina Tuzelova (short explanation of task 1)
// it was written by me, in order to give documentation to ensure that my codes are working properly.

// this code uses the Abstract Factory design pattern, its for the creation of families of related objects .
// i have two interfaces such as: Button_task_5 and Window_task_5 define methods for buttons and windows.
// so also TestAbstractFactory_task_5 class shows creating a factory for Windows and use a button and window.