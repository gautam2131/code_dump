import java.util.Scanner;

public class My extends abs implements Two{
    public static void main(String[] args) {
        Child ch = new Child();
        System.out.println(ch.x);
         Parent pr = ch;
        System.out.println(pr.x);

        int x = My.x;


    }

    @Override
    public void hello() {

    }
    static void methodC(){

    }


    @Override
    public void methodB() {

    }
}

abstract class abs implements Two{
    public static final int a =1;
    public int b =10;
    private int x ;


    public void tom(){
        this.x =1000;
    }

     abstract  void hello();
}
class Parent{
     protected int x = 100;
    public Parent(){
        System.out.println("I am parent");
    }
}
class Child extends Parent{

    public Child(){
        System.out.println("I am child");
       

    }
}

class Factorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println(result);


    }

    // TODO: Implement this method
    static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return  n * factorial(n - 1);
    }
}

