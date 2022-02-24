package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItems(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size());
        for(int i = 0; i<groceryList.size();i++){
            System.out.println((i+1) + ". " +groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem,String newItem){
         int position =  findItem(currentItem);
         if(position>=0){
             modifyGroceryItem(position,newItem);
         }

    }
    private void modifyGroceryItem(int index,String item){
        groceryList.set(index,item);
        System.out.println("Grocery Item "+ (index+1) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int index = findItem(item);
        if(index>=0){
        removeGroceryItem(index);
        }
    }
    private void removeGroceryItem(int index){
        String item = groceryList.get(index);
        groceryList.remove(index);
    }
    private int findItem(String searchItem){
//        boolean exists=groceryList.contains(searchItem);
       return groceryList.indexOf(searchItem);

    }
    public void searchItem(String item){
        if(findItem(item)>=0){
            System.out.println("Found your item " + item +" in list in position no : " +(findItem(item)+1) );
        }else{
            System.out.println(item+" item is not in the list");
        }
    }



}
