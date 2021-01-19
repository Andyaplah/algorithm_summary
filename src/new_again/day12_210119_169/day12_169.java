package new_again.day12_210119_169;

public class day12_169 {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                count++;
                candidate = nums[i];
            }else if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,1};
        System.out.println(majorityElement(arr));
    }
}
