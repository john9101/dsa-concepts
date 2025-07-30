class Solution {
    public int myAtoi(String s) {
        // 1. Check if string is null or empty
        if (s == null || s.isEmpty())
            return 0;

        // 2. Ignore any leading whitespace (" ").
        s = s.stripLeading();

        // 3. Initialize signedness
        int sign = 1;

        // 4. Check if the first character is '-' or '+', then reassign to variable "sign" and ignore the first character
        if (s.startsWith("-") || s.startsWith("+")) {
            sign = s.startsWith("-") ? -1 : 1;
            s = s.substring(1);
        }

        int result = 0;
        int i = 0;
        int n = s.length();

        // 5. Loop with condition characters in string as digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 6. Check if the result overflows
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // 7. Add digits to the result
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}