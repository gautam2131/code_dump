public class Reverse {
    public static void main(String[] args){
        String s = "hello ";
        int size = s.length();
        String d = "";
        for(int i= size-1; i>=0 ;i--){
            d += s.charAt(i);
        }
        System.out.println(d);

        int[][] array = {{1,2,3},{4,5,6},{
            7,8,9
        }};
        for(int i=0; i< array[0].length;i++){
            for(int j=0; j< array.length;j++){
                System.out.println(array[i][j]);

            }
            System.out.println("/n");
        }
    }
}
