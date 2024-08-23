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

    public void printBasket() {
        for (int i = 0; i < product.length; i++) {
            product[i].printProduct();
        }
    }

}
