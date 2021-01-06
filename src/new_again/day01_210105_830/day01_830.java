package new_again.day01_210105_830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day01_830 {

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if(i == n -1 || s.charAt(i) != s.charAt(i+1)){
                if(num >= 3){
                    ret.add(Arrays.asList(i-num+1,i));
                }
                num = 1;
            }else{
                num++;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzyy"));
        //System.out.println(Arrays.asList(1,5));
    }

    /*List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if(i == n-1 || s.charAt(i) != s.charAt(i+1)){
                if(num >= 3){
                    ret.add(Arrays.asList(i-num+1,i));
                }
                num = 1;
            }else{
                num++;
            }
        }
        return ret;*/
}
