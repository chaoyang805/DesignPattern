package creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author derek
 * @version 1.0
 */
public class DirectorTest {

    private Director director = new Director();

    @Test
    public void show() throws Exception {

        director.setBuilder(new BuilderA());
        assertEquals(director.show(),"A1A2");

        director.setBuilder(new BuilderB());
        assertEquals(director.show(),"B1B2");

    }

}