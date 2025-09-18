class Solution {
    public int longestConsecutive(int[] nums) {
        // 1.  Put all numbers into a set for fast lookup
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            // 2. Check if this number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int length = 1;

                // 3. Expand the sequence forward (num+1, num+2, ...)
                while (numSet.contains(num + length)) {
                    length++;
                }

                // 4. Update the longest sequence length found so far
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}