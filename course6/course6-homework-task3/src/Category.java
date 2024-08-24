public class Category {
    private String name;
    private Product[] product;

    public Category(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
            stringBuilder.append(product[i].toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
