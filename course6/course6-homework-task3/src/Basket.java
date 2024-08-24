public class Basket {
    private Product[] product;

    public Basket(Product[] product) {
        this.product = product;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < product.length; i++) {
            stringBuilder.append("\n").append(product[i].toString());
        }
        return stringBuilder.toString();
    }

}
