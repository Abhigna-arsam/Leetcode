class Solution {
    public int maximum69Number (int num) {
        String num1 = Integer.toString(num);
        num1 = num1.replaceFirst("6", "9");
        return Integer.parseInt(num1);
    }
}