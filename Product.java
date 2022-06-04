package VendingMechine;

public enum Product {

    TWIX(1,100), COKE(2,50), WATER(3,30), SANDWICH(4,150);

    private int id;
    private int price;

    Product(int id, int price) {
        this.id = id;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public static Product valueOf ( int productSelected) {
        for (Product product: Product.values()) {
            if(productSelected == product.getId() ) {
                return product ;
            }
        }
        return null ;
    }
}
