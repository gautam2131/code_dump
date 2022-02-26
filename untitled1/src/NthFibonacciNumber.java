import java.util.*;


class NthFibonacciNumber{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacciNumber(n);
        System.out.println(ans);
    }

    // TODO: Implement this method
    //recursive implementation.
//    static int nthFibonacciNumber( int n){
//        if(n==0)return 0;
//        if(n==1)return 1;
//        return nthFibonacciNumber(n-2)+nthFibonacciNumber(n-1);
//    }

    //normal implementation.
    static int nthFibonacciNumber( int n){

        if(n==1) return 1;
        int first = 0;
        int second = 1;
        int  third = 0;
        int count = n;
        for(int i = 2;i<=n;i++){
            third =first + second;
            first =second;
            second = third;
        }
        return third;
    }
}