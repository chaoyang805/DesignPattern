package creational.factorymethod;

/**
 * @author derek
 * @version 1.0
 */
abstract class FactoryMethod {
    static FactoryMethod chooseFactory(String factoryName){
        switch (factoryName){
            case "A": return new FactoryA();
            case "B": return new FactoryB();
            default: return null;
        }
    }
    abstract Product getProduct();
}
class FactoryA extends FactoryMethod {
    @Override
    Product getProduct() {
        return new ProductA();
    }
}
class FactoryB extends FactoryMethod {
    @Override
    Product getProduct() {
        return new ProductB();
    }
}

class Product {}
class ProductA extends Product {}
class ProductB extends Product {}
