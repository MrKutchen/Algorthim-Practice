package CodeWars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodeWars1Test {
    CodeWars1 codeWars1 = new CodeWars1();

    @Test
    public void pressesTest() {
        assertEquals(9, codeWars1.presses("LOL"));
        assertEquals(13, codeWars1.presses("HOW R U"));
    }

    @Test
    public void camelCaseTests() {
        assertEquals( "Incorrect", "camel Casing", codeWars1.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", codeWars1.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", codeWars1.camelCase("camelcasingtest"));
        assertEquals( "Incorrect", "camel Casing", codeWars1.camelCase2("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", codeWars1.camelCase2("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", codeWars1.camelCase2("camelcasingtest"));
    }

    @Test
    public void findNbtest1() {
        assertEquals(2022, codeWars1.findNb(4183059834009L));
    }
    @Test
    public void findNbtest2() {
        assertEquals(-1, codeWars1.findNb(24723578342962L));
    }
    @Test
    public void findNbtest3() {
        assertEquals(4824, codeWars1.findNb(135440716410000L));
    }
    @Test
    public void findNbtest4() {
        assertEquals(3568, codeWars1.findNb(40539911473216L));
    }
}
