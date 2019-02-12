/**
 *Your task is to complete the function convertFive
 *  which takes an integer n as argument and replaces all zeros in the number n with 5 .
 *  Your function should return the converted number .
 */

public class ReplaceZero {



    public  int convertFive(int num) {

        return Integer.parseInt(Integer.toString(num).replace('0', '5'));
    }
}
