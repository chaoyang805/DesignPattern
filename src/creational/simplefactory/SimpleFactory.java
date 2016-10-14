package creational.simplefactory;

/**
 * @author derek
 * @version 1.0
 */
class SimpleFactory {
    static Product getProduct(String productName){
        switch (productName){
            case "A": return new ProductA();
            case "B": return new ProductB();
            default: return null;
        }
    }
}

class Product {}
class ProductA extends Product {}
class ProductB extends Product {}