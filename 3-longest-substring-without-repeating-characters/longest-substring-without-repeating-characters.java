class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If duplicate found (value = 1)
            if (map.getOrDefault(ch, 0) == 1) {
                // Move left until duplicate is removed
                while (map.get(ch) == 1) {
                    map.put(s.charAt(left), 0);
                    left++;
                }
            }

            // Mark current character as present
            map.put(ch, 1);

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}