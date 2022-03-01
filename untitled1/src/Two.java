public interface Two {

     int x = 10;
     private void method(){
         System.out.println("private method");
     }
     default void addition() {
        System.out.println("default method addition");
        method();
    }
     void methodB();
     static void methodC(){

     };
}
