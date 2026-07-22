class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxi) {
                result.add(arr[i]);
            }

            maxi = Math.max(maxi, arr[i]);
        }

        Collections.reverse(result);
        return result;
    }
}