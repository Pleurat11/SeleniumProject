package PracticeJava;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class stringPractice {
    public int countCode(String str) {
        int a = str.indexOf("c");
        int b = str.indexOf("o");
        int c = str.indexOf("e");
        int counter = 0;

        for (int i = 0; i <str.length()-2; i++) {
            if (str.charAt(i) == a && str.charAt(a+1) == b && str.charAt(a+3) == c){
                counter++;
            }
        }
        return counter;
    }


}
