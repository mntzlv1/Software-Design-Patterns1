public class Main {
    public static void main(String[] args) {

        // Initialize Model, View, and Presenter components
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Start the data update process
        presenter.updateData();
    }
}