package LeetCode;

public class DuplicateZero {
    public static void main(String[] args) {
        int ans[]={1,0,2,3,4,5,0};
        duplicateZeros(ans);
    }
    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                for(int j=arr.length-1;j>i;j--) {
                    arr[j]=arr[j-1];
                }
                i++;
            }
            else {
                continue;
            }

        }

    }
}