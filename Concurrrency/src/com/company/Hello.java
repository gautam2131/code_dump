package com.company;


import java.util.Scanner;

class Hello {
        private int number = 0;
        public void setNumber(int i){
           this.number=i;
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    // TODO: Implement this method
    static int countVowels(String str) {
        int count =0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) > 'a' && str.charAt(i) < 'z' || str.charAt(i) > 'A' && str.charAt(i) < 'z'){
                count++;
            }
        }
        return count;

    }


    }

