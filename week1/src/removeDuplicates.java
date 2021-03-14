public class removeDuplicates {
    if(nums == null||nums.length==0) return 0;
    int p = 0;
    int q = 0;
    while(q< nums.length){
        if(nums[p]!=nums[q]){
            nums[p+1]=nums[q];
            p++;
        }
        q++;
    }
    return p+1;
}
