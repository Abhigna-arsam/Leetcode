class Solution {
    public int myAtoi(String s) {
        int index = 0, length = s.length();
        int result = 0, sign = 1;
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }

        if (index < length) {
            char ch = s.charAt(index);
            if (ch == '-') {
                sign = -1;
                index++;
            } else if (ch == '+') {
                index++;
            }
        }

        while (index < length && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}