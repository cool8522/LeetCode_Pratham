class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
    //     for(int i = 0;i<nums.length;i++){
    //         int cnt = 0;
    //         for(int j = 0;j<nums.length;j++){
    //             if (nums[i] == nums[j]){
    //                 cnt++;
    //             }
    //         }
    //         if(cnt>(n/2)){
    //             return nums[i];
    //         }

    //     }
    //     return -1;
    // }
