package misc;

import java.util.Arrays;

public class Misc1 {

    public String reverseStringUsingByteArray(String input) {
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return (new String(result));
    }

    public String reverseStringUsingStringBuilder(String input) {
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        return (input1.toString());
    }

    public String reverseStringUsingCharArray(String input) {
        char[] result = new char[input.length()];
        int index = 0;
        // convert String to character array
        // by using toCharArray
        char[] stringAsCharArray = input.toCharArray();

        for (int i = stringAsCharArray.length - 1; i >= 0; i--) {
            result[index] = stringAsCharArray[i];
            index++;
        }
        return String.valueOf(result);
    }

    public String reverseStringUsingSwapping(String input) {
        char[] result = new char[input.length()];
        int index = 0;

        char[] tempArray = input.toCharArray();
        int left = 0;
        int right = tempArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        for (char c : tempArray) {
            result[index] = c;
            index++;
        }
        return Arrays.toString(result)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
    }

    public int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        return array;
    }
}
