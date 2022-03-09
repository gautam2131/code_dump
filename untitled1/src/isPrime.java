import java.util.Scanner;
import java.lang.System;
public class isPrime {
    public static void main(String[] args) {
        int k = (int) Math.sqrt(24);
        System.out.println(k);
        int off = 1;
        while(off==1){
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(betterIsPrime(num));
            off = scanner.nextInt();

        }


    }
    static boolean isPrime(int n){
        if(n==1) return false;
        for( int i =2 ; i<=n/2 ;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    static boolean betterIsPrime(int n ){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0||n%(n/i)==0)
            return false;
        }
        return true;
    }
}
