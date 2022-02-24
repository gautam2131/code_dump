public class OverFlow {
    public static void main(String[] args) {
        int start = 10;
        int end = Integer.MAX_VALUE;

        int mid = (start + end)/2;
        System.out.println(mid);
        mid = start + (end-start)/2;
        System.out.println(mid);
    }
}
