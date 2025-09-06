class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Count the frequency of each number in nums
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Convert the map into a list of [number, frequency] pairs
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }

        // 3. Sort the list by frequency in descending order
        list.sort((a, b) -> b[1] - a[1]);

        // 4. Pick the top k elements and put them into the result array
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i)[0];
        }

        return result;

    }
}