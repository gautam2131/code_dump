package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          Player tim = new Player("Tim" , 10 , 15 );
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;


        while(!quit) {
            System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "2 to quit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1 :
                    System.out.println("Enter a String");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;

                case 2:
                    quit = true;
                    break;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
             ArrayList<String> value = readValues();
             objectToLoad.read(value);

    }
}
