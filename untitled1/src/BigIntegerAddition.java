import java.util.Scanner;

class BigIntegerAddition extends Object {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    // TODO: Implement this method
    static String bigIntegerAddition(String num1, String num2) {
        if(num1.length()<num2.length()){
            String tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

         int carry = 0 , currentCharAtNum1 = num1.length()-1;
         String result = "";
         for(int i = num2.length()-1 ; i>=0 ; i--){
             int currentSum = (int) num2.charAt(i)- '0'+ (int) num1.charAt(currentCharAtNum1)- '0'+ carry;
             result += Integer.toString((currentSum) % 10);
             carry = (currentSum)/10;
             currentCharAtNum1--;
         }
         for(int j = currentCharAtNum1 ; j >=0 ; j--){
             int currentSum = (int)num1.charAt(j ) - '0'+carry;
             result += currentSum;
             carry = currentSum/10;

         }
         if(carry > 0){
             result += carry;
         }
         StringBuilder x = new StringBuilder(result);
         return new String(x.reverse());
    }
}