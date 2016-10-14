package creational.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class SimpleFactoryTest {

    private Product pa = SimpleFactory.getProduct("A");
    private Product pb = SimpleFactory.getProduct("B");
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