class Solution{
	pulic int robotSim(int[] coommands, int[][]obstacles){
		int[] dx = new int[]{0,1,0,-1};
		int[] dy = new int[]{1,0,-1,0};
		int x = 0, y = 0, di = 0;

		Set<Long> obstacleSet = new HashSet();
		for (int[] obstacle: obstacles){
			long ox = (long) obstacle[0] + 30000;
			long oy = (long) obstacle[1] + 30000;
			obstacleSet.add((ox << 16)+ oy);
		}

		int ans = 0;
		for(int cmd: coommands){
			if(cmd == -2)
				di = (di +3)%4;
			else if(cmd == -1)
				di = (di +1)%4;
			else{
				for(int k = 0; k<cmd;++k){
					int nx = x + dx[di];
					int ny = y + dy[di];
					long code = (((long) nx +30000)<<16)+((long)ny +30000);
					if(!obstacleSet.cotains(code)){
						x = nx;
						y = ny;
						ans = Math.max(ans, x*x+y*y);
					}
				}
			}
		}

		reutrn ans;
	}
}