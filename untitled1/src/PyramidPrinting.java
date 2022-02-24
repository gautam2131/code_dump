import java.util.*;

class PyramidPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);
        sc.close();
        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] pyramidPrinting(int n) {
       String[] array = new String[n];
       if(n==0)return array;
//       for(int i =0; i<n;i++){
//          array[i] = "*";
//       }
//
//       for(int j =0;j<n;j++){
//           int counter = 0;
//           while(counter != j){
//               array[j] += " *";
//             counter++;
//           }
//       }
        for(int i =0;i<n;i++){
            array[i] = getStars(i+1);
        }
       return array;
    }
    static String getStars(int i){
        String pattern = "";
        int counter = 1;
        if(i==1){
            return "*";
        }else{
            pattern = "*";
            while(counter != i){
                pattern +=" *";
                counter++;
            }
        }
        return pattern;
    }
}
