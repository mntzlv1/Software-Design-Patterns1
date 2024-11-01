public class DataPresenter {
    private final DataModel model;  // Holds the data
    private final ConsoleView view;  // Manages user interaction

    // Constructor initializes the model and view
    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    // Method to update data by interacting with the user and model
    public void updateData() {


        // Get new data input from the user and update the model
        String newData = view.getInput("Enter new data: ");
        model.setData(newData);

        // Display the updated data
        view.displayUpdatedData(model.getData());

        // Get additional data, append to the existing data, and display the final data
        String moreData = view.getInput("Enter another piece of data: ");
        model.appendData(moreData);
        view.displayUpdatedData("Final combined data: " + model.getData());
    }
}