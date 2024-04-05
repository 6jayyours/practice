import java.util.*;

public class NoofRectangle {
    public static void main(String[] args) {
        System.out.println("leetcode : 1725");
        int[][] rectangles  = { {5,8}, {3,9}, {3,12} };
        int result = countGoodRectangles(rectangles);
        System.out.println("result : "+result);
    }

    public static int countGoodRectangles(int[][] rectangles) {
        Map<Integer,Integer> result = new HashMap<>();
        int greatestKey = Integer.MIN_VALUE;
        for (int[] rectangle : rectangles) {
            int sideLength = Math.min(rectangle[0], rectangle[1]);
            result.put(sideLength, result.getOrDefault(sideLength, 0) + 1);
            greatestKey = Math.max(greatestKey, sideLength);
        }
        return result.get(greatestKey);
    }
}
