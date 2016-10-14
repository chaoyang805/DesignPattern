package creational.factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class FactoryMethodTest {

    private FactoryMethod fa = FactoryMethod.chooseFactory("A");
    private FactoryMethod fb = FactoryMethod.chooseFactory("B");
    private FactoryMethod fc = FactoryMethod.chooseFactory("C");

    @Test
    public void chooseFactory() throws Exception {

        assertNotNull(fa);
        assertNotNull(fb);
        assertNull(fc);

        assertEquals(fa.getClass().getSimpleName(),"FactoryA");
        assertEquals(fb.getClass().getSimpleName(),"FactoryB");
    }

    @Test
    public void getProduct() throws Exception {
        Product pa = fa.getProduct();
        Product pb = fb.getProduct();

        assertEquals(pa.getClass().getSimpleName(),"ProductA");
        assertEquals(pb.getClass().getSimpleName(),"ProductB");
    }

}