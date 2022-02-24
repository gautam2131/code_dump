import java.util.*;

class FizzBuzz{
    public static String [] fizzBuzz(int n)
    {
        String[] result = new String[n];
        for(int i =1;i<=n;i++){
            if(i%3==0 && i%5==0){
                result[i-1] = "FizzBuzz";
            }else if(i%3==0){
                result[i-1] = "Fizz";
            }else if(i%5==0){
                result[i-1] = "Buzz";
            }else {
                result[i-1] = String.valueOf(i);
            }
        }
         return result;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] ans=fizzBuzz(n);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
