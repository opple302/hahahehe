class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hello bro
        int[] result = new int[2];
        int temp;
        for (int i=0; i<nums.length;i++) {
            int x = target - nums[i];

            int y = i;
            result[0] = y;
            for (int ii=0; ii<nums.length;ii++) {
                if (x == nums[ii] && ii != y) {
                    int z = ii;
                    result[1] = z;
                    if (result[0] > result[1]) {
                        temp = result[0] ;
                        result[0] = result[1];
                        result[1] = temp;
                    }
                    return result;
                }
            }
        }
        return null;
    }
}
