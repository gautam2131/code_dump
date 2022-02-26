import java.util.Scanner;

public class  StringCompression {
    public static String compress(String s) {

        // convert string to charArray.
        char[] array = s.toCharArray();
        String value = "";
         int count = 1;
         int trigger =0;
        for(int i= 0;i<array.length;i++){
            if(i< array.length-1 && array[i]==array[i+1] ){
                count++;
                trigger++;
            }else{
                value += String.valueOf(array[i])+String.valueOf(count);
                count = 1;
            }
        }
        if(value.length() < s.length()){
            return value;
        }
        return s;

    }
    public static void  main (String args []) {
        Scanner sc =  new  Scanner (System.in);
        String s = new String();
        s = sc.next();

        int n = s.length();
        String ans = compress(s);
        System.out.print(ans);
    }
}