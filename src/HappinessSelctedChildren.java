import java.util.*;
import java.util.stream.Collectors;

public class HappinessSelctedChildren {
    public static void main(String[] args) {
        int[] happiness = {1,2,3};
        int k = 2;
        maximumHapinessSum(happiness,k);
    }

    private static void maximumHapinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        int sum = 0;

        for (int n:happiness) {
            System.out.print(n+", ");
        }
    }
}
