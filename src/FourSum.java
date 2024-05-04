import java.util.ArrayList;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        System.out.println("leetcode : 18");
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(foursum(nums,target));
    }

    private static List<List<Integer>> foursum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        generateQuadruplets(target,nums,new ArrayList<>(), quadruplets,0);
        return quadruplets;
    }

    private static void generateQuadruplets(int target, int[] nums, List<Integer> quad, List<List<Integer>> quadruplets, int index) {
        quadruplets.add(new ArrayList<>(quad));

        for (int i = index; i<nums.length;i++) {

        }
    }
}
