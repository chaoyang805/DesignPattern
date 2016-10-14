package creational.simplefactory;

/**
 * @author derek
 * @version 1.0
 * 简单工厂（静态方法工厂）
 * 解决具备相同父类外观的子类产品实例化问题
 */
class SimpleFactory {
    /**
     * @param productName
     * @return Product
     * 根据用户参数（productName）实例化具体子类，以父类类型（Product）返回
     */
    static Product getProduct(String productName){
        switch (productName){
            case "A": return new ProductA();
            case "B": return new ProductB();
            default: return null;
        }
    }
}

/**
 * 产品父类
 * 确保所有子类产品具备相同外观
 */
class Product {}

/**
 * 产品子类：ProductA
 * 继承自产品父类
 */
class ProductA extends Product {}

/**
 * 产品子类：ProductB
 * 继承自产品父类
 */
class ProductB extends Product {}