class Solution {
    int missingNum(int arr[]) {
        
        int n = arr.length+1;
        int xor1 = 0;
        int xor2 = 0;

        // Fix: Compute XOR of 1..n and XOR of array in single passes
        for (int i = 0; i<=n; i++) {
            xor1 ^= i;
        }
        for (int num : arr) {
            xor2 ^= num;
        }

        // The missing number is XOR of the two
        return xor1 ^ xor2;
    }

    }