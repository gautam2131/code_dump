
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
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            if (!hMap.containsKey(a[i])) {
                hMap.put(a[i], 1);
            } else {
                hMap.put(a[i], hMap.get(a[i]) + 1);
            }
        }
        System.out.println(hMap);
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> currentEntry : hMap.entrySet()) {
            if (maxEntry == null || currentEntry.getValue() > maxEntry.getValue()) {
                maxEntry = currentEntry;
            }
        }

        return maxEntry.getKey();
    }

}