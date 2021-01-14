package new_again.day06_210112_136;

public class day06_136 {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = nums[i] ^ ans;
        }
        return ans;
    }
}
