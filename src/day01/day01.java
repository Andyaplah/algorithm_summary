package day01;

import java.util.HashMap;

public class day01 {
    /*
    * 给定 nums = [2, 7, 11, 15], target = 9
      因为 nums[0] + nums[1] = 2 + 7 = 9
      所以返回 [0, 1]
    * */
    private static int[] arr = {2,1,11,15,7};
    private static int[] result = null;
    private static int target = 9;
    public static void main(String[] args) {
//        result = twoSum(arr,target);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }


        HashMap<String, String> map = new HashMap<>();
        map.put("zhang", "31");//存放键值对

        System.out.println(map.containsKey("zhang"));//键中是否包含这个数据
        System.out.println(map.containsKey("31"));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
