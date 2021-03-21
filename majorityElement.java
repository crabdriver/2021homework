class Solution{
	public int magorityElement(int[] nums){
		int cand_num = num[0],count = 1;
		for(int i = 1;i <nums.length;++i){
			if(cand_num==nums[i])
				++count;
			else if(-count == 0){
				cand_num = nums[i];
				count = 1;
			}
		}
		return cand_num;
	}
}