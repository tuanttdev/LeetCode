class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>(); 
        for (int i = 0 ; i < nums.length; i ++){
            if (map.contains(nums[i])){
                return true; 
            }else{
                map.add(nums[i]);
            }
        }
        return false; 
    }

}
// HashSet  provide contains method to check existence of value in constant time O(1) instead of O(n) of ArrayList