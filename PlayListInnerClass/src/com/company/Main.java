package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


      Album album = new Album("Stormbringer" , "Deep purple");
      album.addSong("Stormbringer" , 4.6);
        album.addSong("Love Don't mean a thing" , 4.25);
        album.addSong("Holy Man" , 4.3);
        album.addSong("Hold On" , 5.7);
        album.addSong("Lady Double Dealer" , 3.2);
        album.addSong("You Can't Do It Right" , 3.2);
        album.addSong("Soldier Of Fortune" , 3.13);
        albums.add(album);

        album = new Album ("For those about to rock" , "AC/DC");
        album.addSong("For those about to rock " , 5.44);
        album.addSong("I put the finger on you " , 2.44);
        album.addSong("Lets go " , 5.24);
        album.addSong("Inject the venom " , 2.14);
        album.addSong("Snowballed " , 3.4);
        album.addSong("C.O.D" , 6.4);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You Can't Do It Right",playList);
        albums.get(0).addToPlaylist("Holy Man",playList);
        albums.get(0).addToPlaylist("Deep king",playList);
        albums.get(0).addToPlayList(4,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(14,playList);// there is no track here
//        LinkedList<Song> playList1 = new LinkedList<Song>();

        play(playList);
//        printList(playList1);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        boolean quit  = false;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.isEmpty()){
            System.out.println("No Songs in playList");
            return ;
        }else {
            System.out.println("Now playing " + listIterator.next().toString() );
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+ listIterator.previous().toString());
                            forward= false;
                        }else{
                            System.out.println("we are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+ listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("we are at the end of the list");
                        }

                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6 :
                    if(playList.size()>0){
                        listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());

                    }else if(listIterator.hasPrevious()){
                    System.out.println("Now playing " + listIterator.previous().toString());
                    }

                    }


            }


        }

    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 -- to quit\n" +
              "1 -- to play next song\n"+
                "2 -- to play previous song\n"+
                "3 -- to replay the current song\n"+
                "4 -- list songs in the playlist\n"+
                "5 -- print available actions."+
                "6 -- delete current song from playlist");
    }
    private static void printList(LinkedList<Song> playList){
        if(!(playList.isEmpty())){
            System.out.println("=============");
            for(Song current: playList){
                System.out.println(current.toString());
            }
            System.out.println("=============");
        }

//        System.out.println("aiyo");

    }
}
