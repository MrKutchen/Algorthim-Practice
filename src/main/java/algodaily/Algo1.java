package algodaily;

public class Algo1 {


    //    If it's a multiple of 3, represent it as "fizz".
//    If it's a multiple of 5, represent it as "buzz".
//    If it's a multiple of both 3 and 5, represent it as "fizzbuzz".
//    If it's neither, just return the number itself.
//    return a string with the above constraints
    public String fizzBuzz(int num) {
        StringBuilder result = new StringBuilder();

        //for loop through the num
        for (int i = 1; i <= num; i++) {
            //if divisible by three and 5
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("fizzbuzz");
                //if divisible by 3
            } else if (i % 3 == 0) {
                result.append("fizz");
                //if divisible by 5
            } else if (i % 5 == 0) {
                result.append("buzz");
                //if not divisible, return number to the StringBuilder
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }
}
