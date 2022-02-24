package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
       LinkedList<String> placesToVisit = new LinkedList<String>();
        /*placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");


        printList(placesToVisit);

       placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);


        LinkedList<String> cityList = new LinkedList<String>();
        addInOrder(cityList,"Madras");
        printList(cityList);
        addInOrder(cityList,"Delhi");
        printList(cityList);*/

        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
       Iterator<String> i = linkedList.iterator();
       while(i.hasNext()){
           System.out.println("Now visiting " + i.next());
       }

        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList linkedList , String newCity){
        ListIterator<String> stringListIterator= linkedList.listIterator();
        while(stringListIterator.hasNext()).add(newCity);{
            int comparision = stringListIterator.next().compareTo(newCity);
//            System.out.println(comparision);
            if(comparision==0){
                //same , do not add
                System.out.println(newCity +" is already included as destination");
                return false;
            }
            else if(comparision>0){
                //higher alphabetical order city appeared move back and add
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;

            }
            else if(comparision<0){
                // move on to compare with next city
            }
        }
        stringListIterator
        return true;
    }

    private static void visit (LinkedList cities){
        Scanner scanner = new Scanner(System.in);
      ListIterator listIterator = cities.listIterator();
      boolean quit = false;
      boolean flag = true;
        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary ");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next() );
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday is over ");
                    quit = true;
                    break;
                case 1://next city
                    if(!flag){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        flag = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now Visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        flag = false;


                    }
                    break;
                case 2://previous city
                    if(flag){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        flag = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    }else{
                        System.out.println("we  are at the start of the list");
                        flag = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break ;


            }
        }

    }
    private static void printMenu(){
        System.out.println("Availabe actions:\npress ");
        System.out.println("0 -- to quit\n" +
                "1 -- go to next city\n" +
                "2 -- go to previous city\n"+
                "3 -- print menu options");

    }
}
