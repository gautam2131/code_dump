import java.util.*;

class StringPermutation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int permutation[] = new int[n];

        for (int i = 0; i < n; i++)
            permutation[i] = sc.nextInt();

        String result = stringPermutation(n, str, permutation);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String stringPermutation(int n, String str, int[] permutation) {
        //create char array with the given string of length n.
        char[] stringArray = str.toCharArray();
        String permutedString ="";
        //loop through the permutation array and get and append the corresponding char in permutedArray.
        for(int i =1;i<=n;i++){
           permutedString += String.valueOf(stringArray[findIndex(permutation,i)]);
        }
        return permutedString;
    }
    static int findIndex(int[] positionArray , int element){

        for(int i =0;i<positionArray.length;i++){
            if(positionArray[i]==element) return i;
        }
        return 0;
    }
}