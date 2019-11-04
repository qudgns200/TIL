import java.util.ArrayList;;

public class LeetCode_191018_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 2};
		int result = removeDuplicates(nums);
		System.out.println(result);
	}
	
    public static int removeDuplicates(int[] nums) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for(int i=0; i<nums.length; i++) {
        	if(!list.contains(nums[i])) {
        		list.add(nums[i]);
        	}
        }
        
        for(int i=0; i<list.size(); i++) {
        	nums[i] = list.get(i);
        }
        return list.size(); 
    }

}
