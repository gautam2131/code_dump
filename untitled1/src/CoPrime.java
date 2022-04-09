import java.util.Scanner;

public class CoPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = coprimeNumbers(n);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int coprimeNumbers(int n) {
        int count = 1;
        for(int i = 2 ; i<n ;i++){
           if(isCoPrime(i,n)){
               count++;
           }
        }
         return count;
    }
    static boolean isCoPrime(int m , int n ){
        int min = Math.min(m, n);
        for(int i = 2;i<=(min);i++){
            if(m%i == 0 && n%i ==0  ){
                return false;
            }
        }
        return true;
    }

}
