import java.util.*;

class DecimalToBaseConversion {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        String result = decimalToBaseConversion(n, b);
        System.out.println(result);

    }

    // TODO: Implement this method
    static String decimalToBaseConversion(int n, int b) {
        if(n==0 || n==1){
            return Integer.toString(n);
        }
        int input = n ;
        String s = "";
        while(input>0){
            s += valConvert(input%b);
            input /= b;

        }
        StringBuilder x = new StringBuilder(s);
        return new String(x.reverse());

    }
    static char valConvert(int n){
        if(n>= 0 && n<= 9){
            return (char)(n+48);
        }else
            return(char) (n-10 +65);

    }


}
