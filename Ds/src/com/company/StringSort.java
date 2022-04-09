package com.company;
import java.util.*;

public class StringSort {
    public static void main(String[] args){
        String s = "\"The Tour de France is an annual men's multiple-stage bicycle race primarily held in France, while also occasionally passing through nearby countries. Like the other Grand Tours, it consists of 21 stages, each a day long, over the course of 23 days.\"";
        //Remove all special characters.
        s=s.replaceAll("[^\\w\\s]","");
        System.out.println(s);
        //turn everything to Lowercase. and split the string by whitespaces and store the words in array
        String[] words = s.toLowerCase().split("\\s+");
        //sort the array-words lexically. using quick sort.
        Arrays.sort(words);
//        for(int i =0;i<words.length;i++){
//            System.out.println(i+" : "+words[i]);
//        }
        //creating the hashmap
        HashMap<String,Integer> wordList = new HashMap<>();
        //adding key pair values to hashmap from array
        for(int i=0;i<words.length-1;i++){
            if(!(words[i].equals(words[i+1]))){
                wordList.put(words[i],1);

            }else{
                int value=1;
                while(i<words.length-1 && (words[i].equals(words[i+1]))){
                    value++;
                    i++;
                }
                wordList.put(words[i],value);
            }
        }
        if(!wordList.containsKey(words[words.length-1])){
            wordList.put(words[words.length-1],1);
        }
        System.out.println("values before sorting.");
        displayHashMap(wordList);
        //create ArrayList and copy all element to it from hashmap.
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(wordList.entrySet());
//      System.out.println(list);
        //sort

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue()-o1.getValue();
            }
        });
        System.out.println("after Sorting-------------");
//        list.forEach(k->{
//            System.out.println(k.getKey() + " : "+k.getValue());
//        });
        LinkedHashMap<String,Integer> sortedWordList =new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedWordList.put(entry.getKey(),entry.getValue());
        }
//        for(Map.Entry<String,Integer> entry:sortedWordList.entrySet()){
//            System.out.println(entry.getKey() + " : "+ entry.getValue());
//        }
        displayHashMap(sortedWordList);





    }
    public static void displayHashMap(Map wordList){
        wordList.forEach(
                (key,value)->
                        System.out.println(key + " : " + value)
        );

    }


}
