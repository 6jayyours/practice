import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println("leetcode : 78");
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subs =  new ArrayList<>();

        generateSubsets(nums,0,subs, subsets);
        return subsets;
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> subs, List<List<Integer>> subsets) {
        subsets.add(subs);

        for (int i= index;i<nums.length;i++) {
            subs.add(nums[i]);
            generateSubsets(nums, i+1, subs, subsets);
            subs.remove(subs.size()-1);
        }
    }
}
