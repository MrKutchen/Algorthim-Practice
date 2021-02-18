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
}
