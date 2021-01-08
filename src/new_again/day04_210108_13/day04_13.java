package new_again.day04_210108_13;

import java.util.HashMap;
import java.util.Map;

public class day04_13 {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        int ans = 0;
        for (int i = 0; i < s.length();) {
            if(i+1 <= s.length() && map.containsKey(s.substring(i,i+2))){
                ans = ans + map.get(s.substring(i,i+2));
                i = i + 2;
            }else{
                ans = ans+ map.get(s.substring(i,i+1));
                i = i + 1;
            }
        }

        return ans;
    }

    public int romanToInt1(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if(preNum < num){
                sum = sum - preNum;
            }else{
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum = sum + preNum;
        return sum;
    }

    public int getValue(char c){
        switch (c){
            case 'I':
               return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }


    public static void main(String[] args) {

    }
}
