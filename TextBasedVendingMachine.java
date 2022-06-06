package VendingMechine;

public class TextBasedVendingMachine implements VendingMachine {

    private int selectedProduct;
    private CoinBundle change;

    @Override
    public void displayProducts() {

        System.out.println("*******************************************");
        System.out.println("      WELCOME TO THE VENDING MACHINE       ");
        System.out.println("*******************************************");

        System.out.println("            Product  available:            ");
        System.out.println("                                           ");

        for (Product product : Product.values()) {
            System.out.println("     " + product.getId() + " " + product.name() + " - Price: " + product.getPrice());
        }

        System.out.println("                                ");
        System.out.println(" Please select your product : ");


    }

    @Override
    public void selectProduct(int product) {

        this.selectedProduct = product;


    }

    @Override
    public void displayEnterCoinsMessage() {

        System.out.println("accepted coins : 5 cents / 10 cents / 20 cents / 50 cents / 100 cents");
        System.out.println("Example: If you would like to enter 2 ten cents coins: 0, 2, 0, 0, 0");
        System.out.println("Please enter coins: ");


    }

    @Override
    public void enterCoins(int... coins) {
        // bu kısımdaki amaç change değeri hesaplanıyor, hesaplarken SimpleCalculator
        // sınıfından calculateChange() metodu kullanılıyor
        Calculator calculator = new SimpleCalculator();

        // TRICK ---> SimpleCalculator calculator = new SimpleCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new CoinBundle(coins));
        int changeAmount = total - product.getPrice();
        this.change = calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChangeMessage() {

        System.out.println("                          "   );
        System.out.println("Your change is : "+ change.getTotal() + " cents splitted as follows: ");
        System.out.println("    100 cents coins: "+ change.number100CentsCoins);
        System.out.println("    50 cents coins: "+ change.number50CentsCoins);
        System.out.println("    20 cents coins: "+ change.number20CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
        System.out.println("    5 cents coins: "+ change.number5CentsCoins);


    }
}


































