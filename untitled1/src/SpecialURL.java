import java.util.Scanner;
public class SpecialURL {
//iterate over the String.
//if(s[i]==' ')
//  >change empty space to %20.

    private static String change(String s) {
        char[] StringArray = s.toCharArray();
        for(int i =0;i<StringArray.length;i++){
            if(StringArray[i]==' '){
                StringArray[i]= '0';
            }
        }
        return String.valueOf(StringArray);
    }
    public static void main(String args[]) throws Exception {

        Scanner sc  = new Scanner(System.in);

        String s = new String();
        String ans = new String();
        s = sc.nextLine();
        ans = change(s);
        System.out.print(ans);

    }
}