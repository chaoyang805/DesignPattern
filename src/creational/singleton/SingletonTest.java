package creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class SingletonTest {
    @Test
    public void getInstance() throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertSame(s1,s2);
    }

}