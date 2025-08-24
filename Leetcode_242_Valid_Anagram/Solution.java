class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. If the length of string s and string t are not equal, return false
        if(s.length() != t.length()) return false;

        // 2. Get character arrays from string s and string t
        char[] sca = s.toCharArray();
        char[] tca = t.toCharArray();

        // 3. Sort both character arrays
        Arrays.sort(sca);
        Arrays.sort(tca);

        return Arrays.equals(sca, tca);
    }
}