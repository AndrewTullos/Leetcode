import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }

        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        String numStr = num.toString();


        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return result;

    }
}