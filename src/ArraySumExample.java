public class ArraySumExample {

    public static void main(String[] args) {

        int[] nums = {12, 13, 14, 15};
        int s = 0;
        for (int x : nums) {
            s = s + x;
        }
        System.out.println("Sum of Arrray is==> " + s);
    }
}
