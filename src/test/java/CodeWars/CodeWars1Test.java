package CodeWars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodeWars1Test {
    CodeWars1 codeWars1 = new CodeWars1();

    @Test
    public void simpleTest() {
        assertEquals(9, codeWars1.presses("LOL"));
        assertEquals(13, codeWars1.presses("HOW R U"));
    }
}
