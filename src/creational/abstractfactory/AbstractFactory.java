package creational.abstractfactory;

/**
 * @author derek
 * @version 1.0
 */
abstract class AbstractFactory {
    static AbstractFactory chooseFactory(int factoryNumber){
        switch (factoryNumber){
            case 1: return new Factory1();
            case 2: return new Factory2();
            default: return null;
        }
    }
    abstract IProductA getProductA();
    abstract IProductB getProductB();
}

class Factory1 extends AbstractFactory {
    @Override
    IProductA getProductA() {
        return new Product1A();
    }

    @Override
    IProductB getProductB() {
        return new Product1B();
    }
}
class Factory2 extends AbstractFactory {
    @Override
    IProductA getProductA() {
        return new Product2A();
    }

    @Override
    IProductB getProductB() {
        return new Product2B();
    }
}

interface IProductA {}
interface IProductB {}

class Product1A implements IProductA {}
class Product1B implements IProductB {}
class Product2A implements IProductA {}
class Product2B implements IProductB {}