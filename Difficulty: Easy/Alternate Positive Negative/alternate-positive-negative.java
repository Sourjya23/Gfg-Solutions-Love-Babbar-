class Solution {
    void rearrange(ArrayList<Integer> arr) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int x : arr) {
            if (x >= 0) {
                pos.add(x);
            } else {
                neg.add(x);
            }
        }

        int idx = 0;

        if (pos.size() >= neg.size()) {

            for (int i = 0; i < neg.size(); i++) {
                arr.set(idx++, pos.get(i));
                arr.set(idx++, neg.get(i));
            }

            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(idx++, pos.get(i));
            }

        } else {

            for (int i = 0; i < pos.size(); i++) {
                arr.set(idx++, pos.get(i));
                arr.set(idx++, neg.get(i));
            }

            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(idx++, neg.get(i));
            }
        }
    }
}