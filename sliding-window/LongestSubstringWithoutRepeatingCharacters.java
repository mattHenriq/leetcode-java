// LeetCode 3 - Longest Substring Without Repeating Characters
// Technique: Sliding Window + HashMap
// Time: O(n) | Space: O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastIndex.containsKey(c)) {
                left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
