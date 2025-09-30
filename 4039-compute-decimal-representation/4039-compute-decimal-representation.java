class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> temp = new ArrayList<>();
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                temp.add(digit * place);
            }
            n /= 10;
            place *= 10;
        }
        Collections.reverse(temp);
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}