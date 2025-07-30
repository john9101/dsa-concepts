class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. Select first element in the string array to initialize the prefix
        String prefix = strs[0];

        // 2. Loop the next elements except the first element
        for(int i = 1; i < strs.length; i++){

            // 3. Loop if prefix is not currently in element
            while(strs[i].indexOf(prefix) != 0){

                // 4. Change the new prefix by removing the last element after each loop
                prefix = prefix.substring(0, prefix.length() - 1);

                // 5. Check if prefix is empty then return ""
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}