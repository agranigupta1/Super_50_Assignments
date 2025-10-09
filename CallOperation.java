public class CallOperation {
    // functions :backtrack and isPalindrome are parts of the countUniquePalindromes
    // function
    int countUniquePalindromes(String string) {
        int count = 0;
        backtrack(string, 0, 0);
        return count;
    }

    void backtrack(String string, int count, int start) {
        if (start >= string.length()) {
            return;
        }
        for (int end = start; end < string.length(); end++) {
            if (isPalindrome(string, start, end)) {
                count++;
            }
        }

        backtrack(string, count, start + 1);
    }

    boolean isPalindrome(String string, int start, int end) {
        if (start == end) {
            return true;
        }
        int i = 0, j = string.length() - 1;
        while (i <= j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    int nthFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
    }

    String snakeToCamelcase(String string) {
        int i = 0;
        String temporary = "";
        while (i < string.length()) {
            if (string.charAt(i) != '_') {
                temporary += string.charAt(i);
                i++;
            } else {
                i++;
                temporary += string.charAt(i + 32);
            }
        }
        return temporary;
    }

    int countConsonants(String string) {
        int i = 0, count = 0;
        while (i < string.length()) {
            if (string.charAt(i) != 'a' && string.charAt(i) != 'e'
                    && string.charAt(i) != 'i' && string.charAt(i) != 'o' && string.charAt(i) != 'u') {
                count++;
            }
        }
        return count;
    }

    int binaryTodecimal(String string) {
        int answer = 0;
        int length = string.length();
        for (int i = 0; i < length; i++) {
            answer += string.charAt(i) * Math.pow(2, length - i - 1);
        }
        return answer;

    }

    String expandCharacters(String string) {
        String answer = "";
        for (int i = 1; i < string.length(); i++) {
            int character = string.charAt(i - 1);
            char times = string.charAt(i);
            for (int j = 0; j < times - 48; j++) { // times is a character digit converted to digit(because the ascii
                                                   // value of 0 is:48)
                answer += character;
            }
        }
        return answer;
    }

    String findFrequency(String string) {
        int[] count = new int[26];
        for (int i = 0; i < string.length(); i++) {
            count[string.charAt(i) - 'a']++;
        }
        String answer = "";
        for (int i = 0; i < count.length; i++) {
            answer += 'a' + i;
            answer += count[i];
        }
        return answer;
    }

    boolean checkPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    String numberToWords(int number) {
        String[] ones = {
                "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (number == 0)
            return "Zero";

        if (number < 0)
            return "Minus " + numberToWords(-number);

        String words = "";

        if (number / 1000 > 0) {
            words += numberToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if (number / 100 > 0) {
            words += numberToWords(number / 100) + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20)
                words += ones[number];
            else {
                words += tens[number / 10];
                if (number % 10 > 0)
                    words += " " + ones[number % 10];
            }
        }

        return words.trim();
    }

    String longestSubstring(String string) {
        int i = 0, j = 0;
        boolean[] frequency = new boolean[256];
        int maxLength = 0;
        int[] array = new int[2];
        while (j < string.length()) {
            char ch = string.charAt(j);

            if (frequency[ch]) {
                frequency[string.charAt(i)] = false;
                i++;
            } else {
                frequency[ch] = true;
                if (maxLength < j - i + 1) {
                    maxLength = j - i + 1;
                    array[0] = i;
                    array[1] = j;
                }
                j++;
            }
        }

        return string.substring(array[0], array[1] + 1);
    }

    void Exit() {
        System.out.println("Exiting the program.Thank You");
    }

}
