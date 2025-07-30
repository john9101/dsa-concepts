class Solution {
    public boolean isPalindrome(String s) {
        // 1. Convert all uppercase letters into lowercase letters
        s = s.toLowerCase().trim();
        // 2. Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // 3. Check if the provided phrase is a valid palindrome
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}