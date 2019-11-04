import java.util.ArrayList;

public class LeetCode_191016_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((";
		System.out.println(isValid(s));
	}
	
    public static boolean isValid(String s) {
    	ArrayList<Character> isOpen = new ArrayList<Character>();
    	char[] open = {'(', '{', '['};
    	boolean isCorrect = true;
    	
    	if(s.length()==0) return true;
    	else if(s.length() % 2 != 0) return false;
    	
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i) == open[0] || s.charAt(i) == open[1] || s.charAt(i) == open[2]) {
    			if(s.charAt(i) == open[0]) isOpen.add(open[0]);
    			else if(s.charAt(i) == open[1]) isOpen.add(open[1]);
    			else if(s.charAt(i) == open[2]) isOpen.add(open[2]);
    		} else {
    			if(isOpen.size()==0) continue;
    			else {
    				if(s.charAt(i)==')') {
    					if(isOpen.get(isOpen.size()-1)!=open[0]) {
    						isCorrect = false;
    						break;
    					} else isOpen.remove(isOpen.size()-1);
    				}
    				else if(s.charAt(i)=='}') {
    					if(isOpen.get(isOpen.size()-1)!=open[1]) {
    						isCorrect = false;
    						break;
    					} else isOpen.remove(isOpen.size()-1);
    				}
    				else if(s.charAt(i)==']') {
    					if(isOpen.get(isOpen.size()-1)!=open[2]) {
    						isCorrect = false;
    						break;
    					} else isOpen.remove(isOpen.size()-1);
    				}
    			}
    		}
    	}
    	
    	if(isOpen.size() > 0) isCorrect = false;
    	return isCorrect;
    }
}
