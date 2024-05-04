public class aBC {
    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";

        float num1 = Float.parseFloat(version1);
        float num2 = Float.parseFloat(version2);

        int n = (int) num1;

        System.out.println(num1);
        System.out.println(num2);

    }
}
