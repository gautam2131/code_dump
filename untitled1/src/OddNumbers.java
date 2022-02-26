import java.util.*;

class OddNumbers {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = oddNumbers(n);

        for (int j : result)
            System.out.print(j + " ");

    }

    // TODO: Implement this method
    static ArrayList<Integer> oddNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++){
            if(i%2==1){
                list.add(i);
            }
        }
        return list;

    }
}