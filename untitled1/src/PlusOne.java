import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusOne {
//    public int[] plusOne(int[] digits) {
//        int n = digits.length - 1;
//        if (digits[n] != 9) {
//            digits[n] = digits[n] + 1;
//            return digits;
//        }
//        while (digits[n] == 9) {
//            if (n == 0) {
//                int[] newDigit = new int[digits.length + 1];
//                for (int i = 0; i < newDigit.length; i++) {
//                    if (i == 0) {
//                        newDigit[0] = 1;
//                    } else if (i == 1) {
//                        newDigit[1] = 0;
//                    } else {
//                        newDigit[i] = digits[i - 1];
//                    }
//                    return newDigit;
//                }
//            }
//            digits[n] = 0;
//            if (digits[n - 1] != 9) {
//                digits[n - 1] = digits[n - 1] + 1;
//                break;
//            }
//
//            n--;
//
//            return digits;
//
//        }
public int[] plusOne (int[] digits) {

    int i =digits.length - 1;

    while (i >= 0) {

        if (digits[i] != 9) {
            digits[i] =digits[i] + 1;
            return digits;

        } digits[i] = 0;

        i--;

    }

    int[] newArray = new int[digits.length + 1];

    newArray[0] = 1;
    return newArray;
}



        public static void main (String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] input = in.readLine().split(" ");
            int[] digits = new int[input.length];
            for (int i = 0; i < input.length; ++i) {
                digits[i] = Integer.parseInt(input[i]);
            }

            int[] result = new PlusOne().plusOne(digits);
            for (int i = 0; i < result.length; ++i) {
                System.out.print(result[i]);
                if (i != result.length - 1)
                    System.out.print(" ");
            }
            for(int i=0;i<digits.length;i++){
                System.out.println("");
                System.out.println(digits[i]);
                if (i != digits.length - 1)
                    System.out.print(" ");
            }
        }
    }