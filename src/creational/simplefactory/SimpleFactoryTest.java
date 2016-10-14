package creational.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class SimpleFactoryTest {

    // 创建子类产品A
    private Product pa = SimpleFactory.getProduct("A");
    // 创建子类产品B
    private Product pb = SimpleFactory.getProduct("B");
    // 创建子类产品C（在简单工厂代码原型中并未定义，所以获取null）
    private Product pc = SimpleFactory.getProduct("C");

    @Test
    public void getProduct() throws Exception {

        assertNotNull(pa);
        assertNotNull(pb);
        assertNull(pc);

        assertEquals(pa.getClass().getSimpleName(),"ProductA");
        assertEquals(pb.getClass().getSimpleName(),"ProductB");
    }

}