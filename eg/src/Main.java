public class Main {
    public static void main(String[] apples){
//        String s = "gautam";
//        String t = new String("gautam");
//        String u = "gautam";
//        String v = new String("gautam");
//        String r = "gautam";
//
//        System.out.println(s==u&&u==r);
//        System.out.println(t==u);
//        System.out.println(t==v);

//        Item item1 = new Item("gautam",92);
//        Item item2 = new Item("balaji",92);
//        Item item3 = item1;
//        item2.setName("gautam");
//        System.out.println(item1.getName()+item1.getBalance());
//        System.out.println(item2.getName()+item2.getBalance());
//        System.out.println(item1==item2);
//        System.out.println(item1==item3);

         Object obj = new Object(2);
         Object obj2 = new Object(2);
//         Object obj3 = obj2;
//         obj3.setX(3);
//        System.out.println(obj==obj2);
        System.out.println(obj2.getX());
        System.out.println("from obj - "+ obj.getX());
//        System.out.println(obj);

        System.out.println(obj.equals(obj2));
//        System.out.println(obj3==obj2);

    }
}
