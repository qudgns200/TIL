import java.util.ArrayList;

public class LeetCode_191021_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,2,3};
		
		System.out.println(removeElement(nums, 2));

	}
	
    public static int removeElement(int[] nums, int val) {

    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] != val) {
    			arr.add(nums[i]);
    		}
    	}
    	
    	for(int i=0; i<arr.size(); i++) {
    		nums[i] = arr.get(i);
    	}
        
    	return arr.size();
    }

}
