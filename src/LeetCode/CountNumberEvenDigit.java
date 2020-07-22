package LeetCode;

public class CountNumberEvenDigit {
    public static void main(String[] args) {
     int ar[]={4,5,8,9,10};
     findNumbers(ar);
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            String x=String.valueOf(nums[i]);
            if((x.length())%2==0) {
                count++;
            }

        }
        return count;
    }
}

