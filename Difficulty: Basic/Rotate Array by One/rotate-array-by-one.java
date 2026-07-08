class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int[] temp = new int[n];
        
        for(int i=0;i<n-1;i++){
            temp[i+1]=arr[i];
        }
        temp[0]=arr[n-1];
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}