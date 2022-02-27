import java.util.*;

class MostFrequent {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object[] ans = mostFrequent(s);
        System.out.println(ans[0] + " " + ans[1]);
    }

    // TODO: Implement this method
    static Object[] mostFrequent(String s) {
        //convert string to a charArray.
        Object[] obj = new Object[2];
        char[] sArray = s.toCharArray();

//        sorting the characters
//        Arrays.sort(sArray);
//        creating hMap
//        LinkedHashMap<Character,Integer> hMap = new LinkedHashMap<>();
//        //looping through the sArray and adding the chars to hMap
//        for(int i = 0;i<sArray.length-1;i++){
//            if(sArray[i] != sArray[i+1]){
//                hMap.put(sArray[i],1);
//            }else{
//                int counter = 1;
//                while(i < sArray.length-1 && sArray[i] == sArray[i+1]){
//                    counter++;
//                    i++;
//                }
//                hMap.put(sArray[i],counter);
//            }
//        }
        SortedMap<Character,Integer> hMap = new TreeMap<>();
        //loop the sArray and add the chars to Sorted map while checking if the character is already present in hMap
        for(int i = 0;i<sArray.length;i++){
            if(!(hMap.containsKey(sArray[i]))){
                hMap.put(sArray[i],1);
            }else{
                hMap.replace(sArray[i],hMap.get(sArray[i])+1);
            }
        }

        displayHashMap(hMap);

        List<Map.Entry<Character,Integer>> list = new Vector<>(hMap.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue() - o1.getValue();
            }
        });
                 displayList(list);

        obj[0]=list.get(0).getKey();
        obj[1]=list.get(0).getValue();

        return obj;
    }
    public static void displayHashMap(Map wordList){
        wordList.forEach(
                (bey,value)->
                        System.out.println(bey + " : " + value)
        );

    }

    static void displayList(List<Map.Entry<Character,Integer >> list){
//        list.forEach((i) ->
//                System.out.println(i.getKey() + "  :::  " +i.getValue()));
        for(Map.Entry<Character,Integer> i : list){
            System.out.println(i.getKey() + "  :::  " +i.getValue());
        }

    }
}