
public class ECommerceApp {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.showProduct();     // from Product
        m.showWarranty();    // from ElectronicProduct
        m.showMobile();      // from Mobile
    }
}
class Product {
    String productName = "Generic Product";
    double price = 1000;

    void showProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}

class ElectronicProduct extends Product {
    String warranty = "1 Year";

    void showWarranty() {
        System.out.println("Warranty: " + warranty);
    }
}

class Mobile extends ElectronicProduct {
    String brand = "Samsung";

    void showMobile() {
        System.out.println("Mobile Brand: " + brand);
    }
}
