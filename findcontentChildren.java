class Solution{
	public int findContentChildren(int[] g, int[] s){
		Array.sort(g);
		Array.sort(s)；
		int count = 0;
		for (int i = 0;i < s.length; i++){
			if(s[i] >= g[count]){
				coount++;
				if(count == g.length){
					break;
				}
			}
		}
		return count;
	}
}