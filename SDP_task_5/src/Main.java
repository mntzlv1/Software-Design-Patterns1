public class Main {
    public static void main(String[] args) {

        OldProduct oldProduct = new OldProduct("smart watch", 49.99f);
        Product productAdapter = new ProductAdapter(oldProduct);

        System.out.println("Product name: " + productAdapter.getName());
        System.out.println("Product price: $" + productAdapter.getPrice());
    }
}