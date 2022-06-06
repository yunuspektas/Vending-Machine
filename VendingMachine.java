package VendingMechine;

public interface VendingMachine {

    void displayProducts(); //Hoşgeldiniz mesajı ve ürünleri listeleyen method

    void selectProduct(int product); // ürün seçimi

    void displayEnterCoinsMessage(); // müşterinin girdiği coin leri gösteren metod

    void enterCoins(int... coins); // 1-> girilen coinlerin tutulduğu ve 2-> change değerinin hesaplandığı metod

    void displayChangeMessage(); // para üstünü hesaplayan metod


}
