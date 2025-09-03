class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Initialize a map with the key being a String and the value being a list of Strings
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();

            // 2. Sort the characters in the String and generate a key from the sorted characters
            Arrays.sort(chars);
            String key = new String(chars);

            // 3. If the key does not exist in the map, add the key and value as an empty list.
            // If the key already exists, get the value from the key and add the new string to the list
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}