public class Task3 {
    public static void main(String[] args) throws Exception {
        // Vegetables
        Product product1 = new Product("Carrot", 9.99, 4.8);
        Product product2 = new Product("Potato", 3.99, 3.2);
        Product product3 = new Product("Tomato", 8.99, 5.0);
        Product[] vegetablesArray = { product1, product2, product3 };

        // Snacks
        Product product4 = new Product("Chips", 7.99, 4.3);
        Product product5 = new Product("Waffles", 3.99, 4.6);
        Product product6 = new Product("Strips", 10.99, 4.9);
        Product[] snacksArray = { product4, product5, product6 };

        // Drinks
        Product product7 = new Product("Water", 0.99, 4.3);
        Product product8 = new Product("Soda", 2.99, 4.6);
        Product product9 = new Product("Mineral water", 1.99, 4.9);
        Product[] drinksArray = { product7, product8, product9 };

        // Categories
        Category vagetablesCategory = new Category("Vegetables", vegetablesArray);
        Category snacksCategory = new Category("Snacks", snacksArray);
        Category drinksCategory = new Category("Drinks", drinksArray);
        // Category[] categories = { vagetablesCategory, snacksCategory, drinksCategory
        // };

        // Print Catalog
        // vagetablesCategory.printCatalog(vagetablesCategory, snacksCategory,
        // drinksCategory);

        // Users
        Product[] user1Purchases = { product1, product2, product8 };
        Basket user1Basket = new Basket(user1Purchases);
        User user1 = new User("user1", "123456", user1Basket);
        Product[] user2Purchases = { product3, product5, product9 };
        Basket user2Basket = new Basket(user2Purchases);
        User user2 = new User("user2", "654321", user2Basket);

        // Print users purchases
        user1.printPurchases();
        user2.printPurchases();
    }
}
