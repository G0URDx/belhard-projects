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

    public void printCatalog(Category... categories) {
        System.out.println("\nProducts catalog:");
        for (Category category : categories) {
            System.out.println("\nCategory: " + category.getName());
            for (int i = 0; i < categories.length; i++) {
                category.product[i].printProduct();
            }
        }
    }

    public void printCatalog(Category category) {
        System.out.println("\nProducts catalog:");
        System.out.println("\nCategory: " + category.getName());
        for (int i = 0; i < product.length; i++) {
            category.product[i].printProduct();
        }
    }
}
