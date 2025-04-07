import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {;

        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);

        BigInteger sum = bigA.add(bigB);

        return sum.toString(2);

        // int intA = binaryToInt(a);
        // int intB = binaryToInt(b);

        // int both = intA + intB;

        // return intToBinary(both);
        
    }

    private static int binaryToInt(String binary) {
        int result = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }
        return result;
    }

    private static String intToBinary(int number) {
        if (number <= 0) {
            return "0";
        }

        String binary = "";
        int temp = number;


        int power = 0;
        while (temp > 0) {
            temp /= 2;
            power++;
        }
        power--;

        temp = number;
        for (int i = power; i >= 0; i--) {
            if (temp >= Math.pow(2, i)) {
                binary += "1";
                temp -= Math.pow(2, i);
            } else {
                binary += "0";
            }
        }

        return binary;
    }
}