import java.util.*;

class CheckPrime {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            nums.add(n);
        }

        ArrayList<Boolean> ans = checkPrime(t, nums);

        for (boolean res : ans) {
            System.out.println(res);
        }

    }

    // TODO: Implement this method
    static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) {
        //Holder arrayList for result.
 ArrayList<Boolean> holder = new ArrayList<>();
          for(int i = 0 ; i < nums.size(); i++){
              int currentNumber = nums.get(i);
              if(currentNumber==1 || currentNumber == 0){
                  holder.add(false);
                  continue;
              }
              boolean myFlag = true;
              for(int j = 2; j<= Math.sqrt(currentNumber) ;j++ ){
                  if(currentNumber%j == 0 || currentNumber % (currentNumber/j)==0){
                      myFlag = false;
                      holder.add(false);
                      break;
                  }
              }
              if(myFlag== true){
                  holder.add(true);
              }

          }
            return holder;

    }
}