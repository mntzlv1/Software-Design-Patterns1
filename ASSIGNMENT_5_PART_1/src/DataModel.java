public class DataModel {
    private String data;  // Stores the main data

    // Constructor initializes data with "Initial Data"
    public DataModel() {
        this.data = "Initial Data";
    }

    // Getter for retrieving the current data
    public String getData() {
        return data;
    }


    // Setter for updating data with new input
    public void setData(String data) {
        this.data = data;
    }

    // Appends additional data to the existing data
    public void appendData(String moreData) {
        this.data += " | " + moreData;
    }
}