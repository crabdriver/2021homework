import java.util.HashMap;

public class twosum (int[] nums,int target){
    Map<Interger,Interger> map = new HashMap<>();
    for(int i = 0; i< nums.length;i++){
        if(map.containsKey(target-nums[i])){
            return new int[] {map.get(target-nums[i]),i};
        }
        map.put(nums[i],i);
    }
    throw new lllegalArgumentException("No two sum solution");
}
