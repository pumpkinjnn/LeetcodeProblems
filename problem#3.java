/* Sliding window problem variation, pay attention to 
 * -1 as the initial position because if only
 * one element in array, the size will be 0 - (-1)
 * rather than 0 - 0.
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        HashMap hm = new HashMap<Character, Integer>();
        char cur;
        int max = 1;
        int left = -1;
        for(int i = 0; i < s.length(); i++){
            cur = s.charAt(i);
            left = Math.max(left, (int)hm.getOrDefault(cur, -1));
            max = Math.max(max,i-left);
            hm.put(cur,i);
        }
        return max;
    }
}
