import java.util.HashMap;

class longest_sequence {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> num = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            num.put(nums[i],true);
           
        }
         for(int i = 0;i<nums.length;i++){
                if(num.containsKey(nums[i] - 1)){
                    num.put(nums[i], false);
                }
            }
            int max = 0;
            for(Integer key : num.keySet()){
                if(num.get(key) == true){
                    max = Math.max(max,findLength(num,key));
                }
            }
            return max;
    }

    private static int findLength(HashMap<Integer,Boolean> num,int k){
        int ans = 0;
        while(num.containsKey(k)){
            ans++;
            k++;
        }
        return ans;
    }
}