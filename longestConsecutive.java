import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for(int n : nums) st.add(n);

        int maxLen = 0;

        for(int num : st) {
            if(!st.contains(num-1)) {
                // num is starting points 
                int currLen = 1;
                int currNum = num;

                while(st.contains(currNum+1)) {
                    currLen++;
                    currNum += 1;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }
}


/**
 * 
 * 🔹 Idea:
        Find the length of the longest sequence of consecutive numbers.

    🔹 Steps:

        Store all numbers in a HashSet
            ➔ For O(1) lookup.

            For each number:
            ➔ Check if it's the start of a sequence (i.e., num-1 is not in the set).

            If it's a starting number:
            ➔ Keep checking num+1, num+2, ..., counting how long the sequence is.

            Update the maximum length after each sequence.

            Return the maximum length.

    🔹 Key Points:

            HashSet gives O(1) lookups.

            Only start expanding when num-1 doesn't exist — saves time!

            Overall time complexity: O(N).
 
 */