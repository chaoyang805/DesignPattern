package creational.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class AbstractFactoryTest {

    private AbstractFactory f1 = AbstractFactory.chooseFactory(1);
    private AbstractFactory f2 = AbstractFactory.chooseFactory(2);
    private AbstractFactory f3 = AbstractFactory.chooseFactory(3);

    @Test
    public void chooseFactory() throws Exception {

        assertNotNull(f1);
        assertNotNull(f2);
        assertNull(f3);

        assertEquals(f1.getClass().getSimpleName(),"Factory1");
        assertEquals(f2.getClass().getSimpleName(),"Factory2");
    }

    @Test
    public void getProductA() throws Exception {
        IProductA ipa = f1.getProductA();
        IProductB ipb = f1.getProductB();

        assertEquals(ipa.getClass().getSimpleName(),"Product1A");
        assertEquals(ipb.getClass().getSimpleName(),"Product1B");
    }

    @Test
    public void getProductB() throws Exception {
        IProductA ipa = f2.getProductA();
        IProductB ipb = f2.getProductB();

        assertEquals(ipa.getClass().getSimpleName(),"Product1A");
        assertEquals(ipb.getClass().getSimpleName(),"Product1B");
    }

}