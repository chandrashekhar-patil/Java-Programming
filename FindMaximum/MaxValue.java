package FindMaximum;
public class MaxValue {
    public static void main(String[] args) {
        int[] array = { 3, 5, 7, 2, 8, 6 };

        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
