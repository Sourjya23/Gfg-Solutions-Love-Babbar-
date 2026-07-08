class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        int left = 0;

        for(int right=1;right<n;right++){
            if(arr[left]!=arr[right]){
                arr[left+1]=arr[right];
                left++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= left; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}
