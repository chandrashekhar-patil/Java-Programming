package pelindrome;
class two {
    public static void main(String args[]) {
        int n, r, sum = 0;
        for (int i = 1; i <= 1000; i++) {
            n = i;
            while (n > 0) {
                r = n % 10;
                sum = sum * 10;
                n = n / 10;
            }
            if (i == sum) {
                System.out.println(i + "%d");
            }
            sum = 0;
        }
    }
}