package d18;

public class D18 {

    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
        System.out.println(count7(777777));
    }

    private static int recursionSum(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + recursionSum(arr, i + 1);
    }

    private static int count7(int num) {
        if (num == 0) return 0;
        if (num % 10 == 7) {
            return 1 + count7(num / 10);
        }
        return count7(num/10);
    }

}
