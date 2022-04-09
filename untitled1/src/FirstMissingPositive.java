import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        boolean flag ;
        do{
            i++;
            flag = false;
            for(int j = 0 ; j<nums.length; j++){
                if( nums[j] == i){
                    flag = true;
                }
            }
        }while(flag);
        return i ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}