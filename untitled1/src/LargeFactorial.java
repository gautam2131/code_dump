import java.util.*;

class LargeFactorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = largeFactorial(n);
        for (int j : ans)
            System.out.print(j);

    }

    // TODO: Implement this method
    static int[] largeFactorial(int n) {
        // array to store in reverse.
        int[] factorialReversed = new int[500];

        //initializing the first number in the array to 1 for multiplying.
        factorialReversed[0] = 1;
        int indexOfCarry = 1;

        for(int i = 2 ; i <= n ;i++ ){
            indexOfCarry = multiply(i,indexOfCarry,factorialReversed);
        }

        return formatArray(factorialReversed);
    }
    static int multiply(int x , int indexOfCarry , int[] array ){
        int carry = 0;
        for(int i = 0 ; i<indexOfCarry ; i++){
            int product = array[i]*x + carry;
            array[i]=product%10;
            carry = product/10;
        }
        while(carry!=0){
            array[indexOfCarry] = carry % 10;
            carry /= 10;
            indexOfCarry++;
        }
        return indexOfCarry;
    }
    static int[] formatArray(int[] array){
        int startOfNumber = array.length-1;
        while(array[startOfNumber] == 0){
            startOfNumber--;
        }
        int[] formattedArray = new int[startOfNumber+1];
        int counter = 0;
        for(int i = startOfNumber ; i>=0;i--){
            formattedArray[counter] = array[i];
            counter++;
        }
        return formattedArray;
    }


}