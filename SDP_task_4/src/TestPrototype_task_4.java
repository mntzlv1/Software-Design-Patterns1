public class TestPrototype_task_4 {
    public static void main(String[] args) {
        try {
            Product_task_4 originalProduct = new Product_task_4("Spicy Ramen", 990.0);
            Product_task_4 clonedProduct = originalProduct.clone();
            clonedProduct.setPrice(1300.0);

            System.out.println(originalProduct);
            System.out.println(clonedProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

// SE-2303 Amina Tuzelova (short explanation of task 1)
// it was written by me, in order to give documentation to ensure that my codes are working properly.

// for task 4 i used the Prototype Pattern to make copies of objects.
// first i created class Product_task_4 has details like name and price.
// then i used the clone() method to make a copy of the product.
// sooo after that  it will get a new copy of product.
