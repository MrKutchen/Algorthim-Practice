package misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Misc1Test {

    Misc1 tester = new Misc1();

    @Test
    public void reverseStringUsingByteArrayTest() {
        //given
        String input = "GeeksforGeeks";
        //when
        String expectedResult = "skeeGrofskeeG";
        String actualResult = tester.reverseStringUsingByteArray(input);
        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void reverseStringUsingStringBuilderTest() {
        //given
        String input = "GeeksforGeeks";
        //when
        String expectedResult = "skeeGrofskeeG";
        String actualResult = tester.reverseStringUsingStringBuilder(input);
        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void reverseStringUsingCharArrayTest() {
        //given
        String input = "GeeksforGeeks";
        //when
        String expectedResult = "skeeGrofskeeG";
        String actualResult = tester.reverseStringUsingCharArray(input);
        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void reverseStringUsingSwappingTest() {
        //given
        String input = "GeeksforGeeks";
        //when
        String expectedResult = "skeeGrofskeeG";
        String actualResult = tester.reverseStringUsingSwapping(input);
        //then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void bubbleSortTest() {
        //given
        int[] array = {3, 4, 1, 6, 4, 7, 9};
        //when
        int[] expectedResult = {1, 3, 4, 4, 6, 7, 9};
        int[] actualResult = tester.bubbleSort(array);
        //then
        Assert.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
