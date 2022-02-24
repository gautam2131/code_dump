public class QueriedElement {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
//
//        int q = sc.nextInt();
//
//        while (q-- > 0) {
//
//            int x = sc.nextInt();
//            int result = findElementQuery(n, arr, x);
//
//            System.out.println(result);
//
//        }
        int[] arr = {1,2,3,4,5};
        System.out.println(findElementQuery(5,arr,3));

    }
    //find the mid of the array.
    //if(mid<x) start= mid+1;
    // if(mid>=x)  end= mid;

    // TODO: Implement this method
    static int findElementQuery(int n, int[] arr, int x) {
//        for(int i=0;i<n;i++){
//            if(arr[i]== x){
//                return i;
//            }
//        }
//        return -1;
      int start = 0 , end = n-1 , res =-1;
      while(start <= end){

          int mid = start + (end-start)/2;

          if(arr[mid] < x){
              start = mid+1;
          } else if(arr[mid] > x){
              end = mid-1;
          }else{
              res=mid;
              end=mid-1;
          }
      }
      return res;
    }
}
