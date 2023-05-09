public class maths {
    public static void main(String[] args) {
        // countDigits(32456789);
        // reverseNumber(323247);
        // armstrongNumber(170);
        // printAllDivisors(97);
        // mergeAlternately("abcs","pewqtu"); //Leetcode problem of the day

    }

    static void countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    static void reverseNumber(int n) {
        int temp = 0;
        while (n != 0) {
            int digit = n % 10;
            temp = temp * 10 + digit;
            n = n / 10;
        }

        System.out.println(temp);
    }

    static void armstrongNumber(int n) {
        int count = 0;
        int temp = n;
        int originalN = n;
        int result = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, count);
            temp = temp / 10;
        }
        if (result == originalN)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    static void printAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        String result = "";
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                result += word1.charAt(i);
            }
            if (i < word2.length()) {
                result += word2.charAt(i);
            }

        }
        System.out.println(result);
    }

}
