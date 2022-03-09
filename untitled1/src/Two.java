public interface Two {

     int x = 10;
     static int b =10;
     private static void method(){
         System.out.println("private method");
     }
     default void methodD(){

         System.out.println(b);
     }
      default void addition() {
        System.out.println("default method addition");
        method();
    }
     void methodB();
     static void methodC(){

     }
}
