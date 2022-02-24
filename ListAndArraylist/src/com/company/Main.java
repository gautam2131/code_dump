package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList shopList = new GroceryList();
    public static void main(String[] args) {
        boolean flag = false;
        int choice =0;
        printInstructions();
        while(!flag){
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addGroceryItem();
                    break;
                case 3:
                    modifyGroceryItem();
                    break;
                case 4:
                    removeGroceryItem();
                    break;
                case 5:
                    searchGroceryItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    flag = true;
                    break;

            }

        }
    }

    public static void printInstructions(){
        System.out.println("\npress");
        System.out.println("\t0 - To print choices options");
        System.out.println("\t1 - To print grocery list");
        System.out.println("\t2 - To add item to the grocery list");
        System.out.println("\t3 - To modify a item in the list ");
        System.out.println("\t4 - To remove a item from the list");
        System.out.println("\t5 - To search a item");
        System.out.println("\t6 - To process whatever i did");
        System.out.println("\t7 - To quit app");
    }

    public static void printGroceryList(){
        shopList.printGroceryList();
    }
    public static void addGroceryItem(){
        System.out.println("Enter the item");
        String item =scanner.nextLine();
        shopList.addGroceryItems(item);
    }
    public static void modifyGroceryItem(){
        System.out.println("Enter the current grocery item you to modify");
        String currentItem = scanner.nextLine();
        System.out.println("Enter the Item number");
        String newItem = scanner.nextLine();
        shopList.modifyGroceryItem(currentItem,newItem);


    }
    public static void removeGroceryItem(){
        System.out.println("Enter the Item ");
       String item = scanner.nextLine();
        shopList.removeGroceryItem(item);


    }
    public static void searchGroceryItem(){
        System.out.println("Enter the Item to search");
        String item = scanner.nextLine();
        shopList.searchItem(item);

    }
    public static void processArrayList(){
        ArrayList<String> newArray =new ArrayList<>();
        newArray.addAll(shopList.getGroceryList());
        for(int i = 0; i<newArray.size();i++){
            System.out.println((i+1) + ". " +newArray.get(i));
        }
        ArrayList<String> nextArray =new ArrayList<>(shopList.getGroceryList()) ;
        for(int i = 0; i<nextArray.size();i++){
            System.out.println((i+1) + ". " +nextArray.get(i));
        }
        String[] arr = new String[shopList.getGroceryList().size()];
         shopList.getGroceryList().toArray(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println((i+1) + ". " +arr[i]);
        }
    }

}
