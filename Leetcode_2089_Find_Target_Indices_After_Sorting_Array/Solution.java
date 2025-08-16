class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // 1. Initialize the count array with a maximum of 100 elements.
        int[] count = new int[101];

        // 2. Count the number of occurrences of each element in the count array
        for(int num : nums){
            count[num]++;
        }

        // 3. Initialize the result list with size equal to the number of occurrences of target
        List<Integer> result = new ArrayList<>(count[target]);

        // 4. If the number of occurrences of target is 0, return an empty list
        if(count[target] == 0){
            return result;
        }

        // 5. Calculate the starting position of the target
        int s = 0;
        for(int val = 1; val < target; val++){
            s += count[val];
        }

        // 6. Add target positions to the result list
        for(int i = s; i < s + count[target]; i++){
            result.add(i);
        }

        return result;
    }
}