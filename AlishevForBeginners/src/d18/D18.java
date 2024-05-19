package d18;

public class D18 {

    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(sum(numbers,0));
    }

    private static int sum(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sum(arr, i + 1);
    }
}
