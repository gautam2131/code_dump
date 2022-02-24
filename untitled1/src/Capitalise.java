import java.util.*;

class Capitalise {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        System.out.println(capitalised('a'));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);


    }

    // TODO: Implement this method
    // 1.iterate thru the String.
    //  2.check str[i] is isLowerCaseAlphabet()
    // >2.1 if i==0 || str[i-1] == " "
    // >2.1.1 capitalised str[i]
    static String capitalise(String str) {
     char[] array = str.toCharArray();

        for(int i=0;i< array.length;i++){
            if(isLowerCaseAlphabet(array[i])){
                if( i==0 || array[i-1] == ' '){
                  array[i] = capitalised(array[i]) ;
                }
            }
        }
        return String.valueOf(array);
    }

    private static Boolean isLowerCaseAlphabet(char ch){
        return(ch >= 'a' && ch <= 'z');
    }


    private static char capitalised(char chr){
        return (char)((chr -'a')+'A');
    }
}