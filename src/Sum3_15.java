import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_15 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {// 1
        List<List<Integer>> result = new ArrayList<>(); // 2
        Arrays.sort(nums); // 3
        for (int i = 0; i < nums.length - 2; i++) { // 4
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // 5
                int low = i + 1, high = nums.length - 1, sum = 0 - nums[i]; // 6
                while (low < high) { // 7
                    if (nums[low] + nums[high] == sum) { // 8
                        result.add(Arrays.asList(nums[i], nums[low], nums[high])); // 9
                        while (low < high && nums[low] == nums[low + 1]) low++; // 10
                        while (low < high && nums[high] == nums[high - 1]) high--; // 11
                        low++; // 12
                        high--; // 13
                    } else if (nums[low] + nums[high] < sum) { // 14
                        low++; // 15
                    } else { // 16
                        high--; // 17
                    }
                }
            }
        }
        return result; // 18

    }
}
