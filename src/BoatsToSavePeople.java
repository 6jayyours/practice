import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        System.out.println("leetcode : 881");
        int[] people = {3,5,3,4};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));

    }
    private static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int nob = 0;
        int start = 0;
        int end = people.length-1;
        while (start <= end) {
            if (people[start] + people[end] <= limit) {
                start++;
            }
            end--;
            nob++;
        }
        return nob;
    }
}
