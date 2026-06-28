class Solution {
    public String multiplyStrings(String s1, String s2) {

        // Handle zero
        if (s1.equals("0") || s2.equals("0"))
            return "0";

        // Check sign
        boolean negative = false;

        if (s1.charAt(0) == '-') {
            negative = !negative;
            s1 = s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            negative = !negative;
            s2 = s2.substring(1);
        }

        int n = s1.length();
        int m = s2.length();

        int[] result = new int[n + m];

        // Multiply like we do on paper
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int d1 = s1.charAt(i) - '0';
                int d2 = s2.charAt(j) - '0';

                int product = d1 * d2;

                int p2 = i + j + 1;
                int p1 = i + j;

                int sum = product + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while (i < result.length && result[i] == 0)
            i++;

        while (i < result.length)
            ans.append(result[i++]);

        if (ans.length() == 0)
            return "0";

        if (negative)
            ans.insert(0, '-');

        return ans.toString();
    }
}