public class merge2array int[] nums1,int m, int[] nums2,int n){
    int len1 = m-1;
    int len2 = n-1;
    int len = m + n - 1;
    while(len1 >= 0 && len2 >= 0){
        nums1[len--] = nums[len1] > nums[len2]?nums[len1--]:nums2[len2--];
        }
    System.arraycopy(nums2,0,nums1,0,len+2+1);
}
