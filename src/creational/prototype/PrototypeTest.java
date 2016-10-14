package creational.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class PrototypeTest {
    @Test
    public void test() throws Exception {
        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();
        assertNotSame(p1,p2);
    }

}