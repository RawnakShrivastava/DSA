import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        // printNTimes(10);
        // oneToN(5, 1);
        // nToOne(20);
        // sumOfFirstN(10, 0);

        // System.out.println(factorial(5));

        // int[] arr = { 3, 5, 6, 2, 1, 4 };
        // reverseArray(arr, 0, arr.length - 1);

        // System.out.println(isPalindrome(0, "madam"));

        // System.out.println(fibonacciNumber(5));
    }

    static void printNTimes(int n) {
        if (n > 0) {
            System.out.println("HEllo");
            n--;
            printNTimes(n);
        }
    }

    static void oneToN(int n, int start) {
        if (start > n) {
            return;
        }
        System.out.println(start);
        oneToN(n, start + 1);

    }

    static void nToOne(int n) {
        if (n <= 0)
            return;
        System.out.println(n);
        nToOne(n - 1);
    }

    static void sumOfFirstN(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfFirstN(n - 1, sum + n);
    }

    static int factorial(int n) {
        if (n <= 0)
            return 1;

        return n * factorial(n - 1);
    }

    static void reverseArray(int[] arr, int start, int end) {
        if (start > end) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = 0;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    static boolean isPalindrome(int start, String s) {
        if (start > s.length() / 2)
            return true;

        if (s.charAt(start) != s.charAt(s.length() - start - 1))
            return false;

        return isPalindrome(start + 1, s);
    }

    static int fibonacciNumber(int n) {
        if (n <= 1)
            return n;
        int last = fibonacciNumber(n - 1);
        int secondLast = fibonacciNumber(n - 2);

        return last + secondLast;

    }
}
