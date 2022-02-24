public class Demo {
    public static void main(String[] args){

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "Chennai Mumbai Delhi Coimbatore Goa Hyderabad Bangalore Vellore";
        String stringData2= "1 2 4 5 3 6 9 8 7";
        String[] data = stringData2.split(" ");

        for(String s:data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("4"));
        list.traverse(list.getRoot()); list.removeItem(new Node("9"));
        list.traverse(list.getRoot()); list.removeItem(new Node("1"));
        list.traverse(list.getRoot()); list.removeItem(new Node("3"));
        list.traverse(list.getRoot()); list.removeItem(new Node("5"));
        list.traverse(list.getRoot()); list.removeItem(new Node("8"));
        list.traverse(list.getRoot()); list.removeItem(new Node("6"));
        list.traverse(list.getRoot()); list.removeItem(new Node("7"));
        list.traverse(list.getRoot());

    }
}
