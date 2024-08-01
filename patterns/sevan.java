import java.util.*;

class sevan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row");
        int row = sc.nextInt();

        // outer loop for rows
        for (int i = 1; i <= row; i++) {
            // inner loop for col
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}