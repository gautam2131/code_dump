
import java.util.*;

class MostRepeatedTemperature {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = mostRepeatedTemperature(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int mostRepeatedTemperature(int n, int a[]) {
        int mostRepeated = a[0] ,maxCounter =1;

       for(int i=0;i<n-1;i++) {
           int currCounter = 1;
           for (int j = i + 1; j < n; j++) {
               if (a[i] == a[j]) {
                   currCounter++;
               }
           }
           if (currCounter > maxCounter) {
               maxCounter = currCounter;
               mostRepeated = a[i];
           } else if (currCounter == maxCounter && a[i] > mostRepeated) {
               mostRepeated = a[i];
           }
           if (maxCounter == currCounter && i == n - 2 && a[i + 1] > mostRepeated) {
               mostRepeated = a[i + 1];
           }

       }
       return mostRepeated;

//      int counter =0;
//      Arrays.sort(a);
//     for(int i =0;i<a.length-1;i++){
//         int tempCounter =1;
//         for(int j =1;j<a.length;j++){
//             if(a[i]==a[j]){
//                 tempCounter++;
//             }
//         }
//         if(tempCounter>counter){
//             mostRepeated=a[i];
//             counter = tempCounter;
//         }
//     }
//     return mostRepeated;
    }


//    static int mostRepeatedTemperature(int n, int a[]) {
//        HashMap<Integer, Integer> hMap = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            if (!hMap.containsKey(a[i])) {
//                hMap.put(a[i], 1);
//            } else {
//                Integer temp = hMap.get(a[i]);
//                hMap.replace(a[i],temp+1);
//            }
//        }
//        Map.Entry<Integer, Integer> maxEntry = null;
//
//        for (Map.Entry<Integer, Integer> currentEntry : hMap.entrySet()) {
//            if (maxEntry == null || currentEntry.getValue()> maxEntry.getValue()) {
//                maxEntry = currentEntry;
//            }
//        }
//        return maxEntry.getKey();
//
//    }

}