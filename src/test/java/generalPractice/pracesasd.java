package generalPractice;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pracesasd {
    public static void main(String[] args) {

    }
    public boolean firstLast6(int[] nums) {
        if(nums.length > 1){
            if(nums[0] == 6 || nums[nums.length-1] == 6){
                return true;
            }
        }
        return false;
    }
    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 1){
            if (nums[0] == nums[nums.length-1]){
                return true;
            }
        }
        return false;
    }
    public int[] makePi() {
        int[] myArr = {3,1,4};
        return myArr;
    }
    public boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length>=1){
            if (a[0] == b[0] || a[a.length-1] == b[b.length-1]){
                return true;
            }
        }
        return false;
    }
    public int sum3(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
    public int[] rotateLeft3(int[] nums) {
        int [] myArr = {nums[1], nums[2], nums[0]};
        return myArr;
    }
    public int sum2(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        else if (nums.length == 0){
            return 0;
        }
        return nums[0] + nums[1];
    }
    public int[] makeEnds(int[] nums) {

            int [] newArr = {nums[0], nums[nums.length-1]};

        return newArr;
    }
    public String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 0; i <n; i++) {
            newString = newString + str;
        }
        return newString;
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 30 && cigars <=50){
            isWeekend = true;
        }
        return isWeekend;
    }



}
