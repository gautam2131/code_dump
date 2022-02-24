public class Solution {
    public static void main(String[] args){
        String s = "gautam";
        String s1= "gautam";
        s1=s1.toUpperCase();
        String s2= new String("gautam");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s==s1);
        System.out.println(s==s2);
        int[] array =  new int[5
                ];
        for(int i = 0 ; i<array.length ; i++){
            array[i] = i;
        }
        System.out.println("The sum is : " + sum(array,array.length-1));
        print(array,0);
        System.out.println(fib(100));
    }
//   static int sum(int[] array ,int i){
//        if(i == array.length)
//            return 0;
//        return sum(array ,i +1)+array[i];
//    }

    static int sum (int[] array ,int size){
        if(size<0) {
            return 0;
        }
        return sum(array,size-1)+array[size];
    }
    static void print(int[] array,int i){
        if(i==array.length)
            return ;
        if(i==0){
            System.out.println("Before");
        }
        System.out.println(array[i]);
        print(array,i+1);
        if(i==array.length-1){
            System.out.println("After");
        }
        System.out.println(array[i]);

    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
