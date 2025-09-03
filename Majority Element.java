class Solution {
    public int majorityElement(int[] nums) {
        int lead = 0;
        int majority = 0;
        for(int i: nums){
            if(lead == 0){
                majority = i;
                lead=1;
            }else if(i == majority){
                lead++;
            }else{
                lead--;
            }
        }
        return majority;
    }
}
