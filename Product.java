package VendingMechine;

public enum Product {
 // TRICK --- >
 //Değişkenlerin alabileceği değerlerin sabit
 // (belli) olduğu durumlarda programı daha okunabilir hale getirmek için kullanılır.
 // Programda birçok değişkene tek tek sayısal değer vermek yerine "enum" kullanılabilir.

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

    // kullanıcının girdiği indexe uyan product ı döndüren metod
    public static Product valueOf ( int productSelected) {
        for (Product product: Product.values()) {   // values() methodu sabit değişkenleri sirasıyla döndüren method
            if(productSelected == product.getId() ) {
                return product ;
            }
        }
        return null ;
    }
}
