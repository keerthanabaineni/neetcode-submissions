class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int mult = 1;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = mult;
            mult = mult * nums[i];
        }

        mult = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * mult;
            mult = mult * nums[i];
        }

        return arr;
    }
}