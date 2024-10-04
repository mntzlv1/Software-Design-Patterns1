class ProductAdapter implements Product {
    private OldProduct oldProduct;

    public ProductAdapter(OldProduct oldProduct) {
        this.oldProduct = oldProduct;
    }

    @Override
    public String getName() {
        return oldProduct.getTitle();
    }

    @Override
    public double getPrice() {
        return oldProduct.getCost();
    }
}
