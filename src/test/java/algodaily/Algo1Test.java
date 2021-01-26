package algodaily;

import org.junit.Assert;
import org.junit.Test;

public class Algo1Test {
    Algo1 tester = new Algo1();

    @Test
    public void fizzBuzzTest() {
        //given
        int input = 15;
        //when
        String expectedResult = "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz";
        String actualResult = tester.fizzBuzz(input);
        //then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
