package VendingMechine;

public interface VendingMachine {

    void displayProducts(); //Hoşgeldiniz mesajı ve ürünleir listeleyen method

    void selectProduct(int product); // ürün seçimi

    void displayEnterCoinsMessage(); // müşterinin girdiği coin leri gösteren metod

    void enterCoins(int... coins); // girilen coinlerin tutulduğu method

    void displayChangeMessage(); // para üstünü hesaplayan metod


}
