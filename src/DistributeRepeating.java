import java.util.HashMap;
import java.util.Map;

public class DistributeRepeating {
    public static void main(String[] args) {
        System.out.println("leetcode : 1655");
        int[] nums = {1,1,2,2,1};
        int[] quantity = {2,2,1};
        System.out.println(canDistribute(nums,quantity));
    }

    public static  boolean canDistribute(int[] nums, int[] quantity) {
        Map<Integer, Integer> amount = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (int n : nums) {
            amount.put(n, amount.getOrDefault(n, 0) + 1);
        }
        System.out.println(amount);
        for (Map.Entry<Integer, Integer> entry : amount.entrySet()) {
            int value = entry.getValue();
            for (int n : quantity) {
                if (value == n) {
                    count++;
                    break;
                }
                sum = sum+n;
            }
            System.out.println(sum);

            if(sum == entry.getValue().intValue()){
                return true;
            }
        }
        if (count == quantity.length) {
            return true;
        } else {
            return false;
        }
    }
}
