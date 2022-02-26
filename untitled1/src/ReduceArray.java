import java.util.*;


class ReduceArray{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int reduceArray(int n, int a[]){
        //declare a priority queue
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            q.add(a[i]);
        }
        while(q.size()>1){
            int max = q.poll();
            int secondMax = q.poll();
            int absDiff = Math.abs(max-secondMax);
            q.add(absDiff);
        }
        return q.poll();
    }
}