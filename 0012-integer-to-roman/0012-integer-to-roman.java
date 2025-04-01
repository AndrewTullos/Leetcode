class Solution {
    public String intToRoman(int num) {

        String[][] symList = {
            {"M", "1000"},
            {"CM", "900"},
            {"D", "500"},
            {"CD", "400"},
            {"C", "100"},
            {"XC", "90"},
            {"L", "50"},
            {"XL", "40"},
            {"X", "10"},
            {"IX", "9"},
            {"V", "5"},
            {"IV", "4"},
            {"I", "1"}
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < symList.length; i++) {
            int val = Integer.parseInt(symList[i][1]);
            String sym = symList[i][0];

            while (num >= val) {
                result.append(sym);
                num -= val;
            }
        }

        return result.toString();
    }
}
