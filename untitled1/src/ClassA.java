public class ClassA {
    void print(){
        System.out.println("Hello I am from outer class");
    }
    public static void main(String[] args) {
        ClassA outer = new ClassA();
        ClassA.ClassB  innerChained = new ClassA().new ClassB();
        ClassA.ClassB inner = outer.new ClassB();

        innerChained.print();

    }
    class ClassB{
        void print(){
            System.out.println("Hello i am from inner class");
        }
    }
}
