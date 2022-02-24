public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem item){
        this.root = item;
    }






    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //The list is empty, so this newItem becomes the head of the list
            this.root=newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison<0){
                //newItem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //there is no nextItem, so add the newItem
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison>0){
                //newItem is less, insert before currentItem.
                if(currentItem.previous() != null){
                    //add newItem in currentItem's place and add currentItem next to newItem.
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    //since there is no previous node, currentNode is root node.
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                     this.root = newItem;
                }
                return true;
            }else{
                //equal
                System.out.println(newItem.getValue() + "is already present , not added.");
                return false;
            }
        }


        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null ){
             int comparison = currentItem.compareTo(item);
             if(comparison == 0){
                 if(currentItem == this.root){
                     this.root=currentItem.next();
                 }else{
                     currentItem.previous().setNext(currentItem.next());
                     if(currentItem.next()!=null){
                         currentItem.next().setPrevious(currentItem.previous());
                     }
                 }
                 return true;
             }else if(comparison < 0){
                     currentItem = currentItem.next();
             }else{
                 return false;
             }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
                System.out.println("The list is empty");
            }else{
                while(root != null){
                    System.out.println(root.getValue());
                    root = root.next();
            }
        }

    }
}
