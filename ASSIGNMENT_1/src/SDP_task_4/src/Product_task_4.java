class Product_task_4 implements Cloneable {
    private String name;
    private double price;

    public Product_task_4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Product_task_4 clone() throws CloneNotSupportedException {
        return (Product_task_4) super.clone();
    }

    @Override
    public String toString() {
        return "Product [Name=" + name + ", Price=" + price + "]";
    }
}
