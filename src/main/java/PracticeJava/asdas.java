package PracticeJava;

import java.util.Objects;

public class asdas {
    public static void main(String[] args) {
        String str = "Kjo eshte fjalia ime e gjate gjate gjate";
        int count = 1;

        str = str.toLowerCase();

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }


    public boolean haveThree(int[] nums) {

        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k <nums.length; k++) {
                    if (nums[i] == 3 && nums[j] == 3 && nums[k] == 3){
                        return true;
                    }
                }
            }
        }
        return false;
    }






    public static String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b+a+b;
        }
        else return a+b+a;
    }

    public String atFirst(String str) {
        if(str.length() < 2){
            return str + "@";
        }
        else if(str.length()==0){
            return "@@";
        }
        return str.substring(0,2);
    }
    /*

Return true if the string "cat" and "dog" appear the same number of times in the given string.
     */
    public boolean catDog(String str) {

        for (int i = 0; i <str.length(); i++) {
            int catCount = 0;
            int dogCount = 0;
            if (str.contains("dog")){
                dogCount++;
            }
            else if (str.contains("cat")){
                catCount++;
            }
            if (dogCount == catCount){
                return true;
            }
        }
        return false;
    }

    public boolean endOther(String a, String b) {
        if (a.endsWith(b)){
            return true;
        }
        else if (b.endsWith(a)){
            return true;
        }
        return false;
    }
    public boolean xyzThere(String str) {
        int counter = 0;
        for (int i = 0; i <str.length(); i++) {
            if (str.substring(i).contains("xyz")){
                return true;
            }
            else if (str.substring(i-1).contains(".")){
                return false;
            }
        }
        return false;
    }
    public boolean bobThere(String str) {

        for (int i = 0; i <str.length(); i++) {
            if (str.substring(i).equalsIgnoreCase("b") && str.substring(i+2).contains("b")){
                return true;
            }
        }
        return false;


    }
    public int countEvens(int[] nums) {
        int counter = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
    public int arraySum( int[] array) {
        int sum = 0;
        for(int i = 0; i <= array.length; i++){
            sum = sum + array[i];
        }

        return sum;
    }
    public int[] fizzArray(int n) {
        return new int[n];
    }

    public int countCode(String str) {
        int counter = 0;
        for (int i = 0; i <str.length()-1; i++) {
            if ("" + str.charAt(i) == "c" && "" + str.charAt(i+1) == "o" && "" + str.charAt(i+3) == "e" ){
                counter++;
            }
        }
        return counter;
    }

}