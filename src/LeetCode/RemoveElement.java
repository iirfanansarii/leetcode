package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {

    }

}

//leetcode solution starts here
    class Solution {
        public int removeElement(int[] nums, int val) {
            if(nums.length == 0)  return 0;

            int j=0;
            for(int i=0; i<nums.length; i++){
                if( nums[i]!=val){
                    nums[j]=nums[i];
                    j++;

                }


            }

            return j;


        }
}
