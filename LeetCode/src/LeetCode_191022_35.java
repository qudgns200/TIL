
public class LeetCode_191022_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 0;
		
		System.out.println(searchInsert(nums, target));

	}
	
    public static int searchInsert(int[] nums, int target) {
        int idx=-1;
        
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]==target) {
        		idx = i;
        		break;
        	} else {
        		if(nums[i] > target) {
        			idx = i;
        			break;
        		}
        	}
        }
        if(idx==-1) idx = nums.length;
        return idx;
    }

}
