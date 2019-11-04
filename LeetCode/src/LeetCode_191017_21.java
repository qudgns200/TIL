
public class LeetCode_191017_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		//l1.next = new ListNode(2);
		//l1.next.next = new ListNode(4);
		
		//ListNode l2 = new ListNode(1);
		ListNode l2 = null;
		//l2.next = new ListNode(3);
		//l2.next.next = new ListNode(4);
		
		ListNode l3 = mergeTwoLists(l1, l2);
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        boolean b1 = true, b2 = true;
        if(l1==null) b1=false;
        if(l2==null) b2=false;
        
        while(b1 != false || b2 != false) {
     	
        	if(b1==true && b2==true) {
        		if(l1.val <= l2.val) {
        			head.next = new ListNode(l1.val);
        			if(l1 != null) l1 = l1.next;
        		}
        		else {
        			head.next = new ListNode(l2.val);
        			if(l2 != null) l2 = l2.next;
        		}
        	} else if(b1==false && b2==true) {
    			head.next = new ListNode(l2.val);
    			if(l2 != null) l2 = l2.next;
        	} else if(b1==true && b2==false) {
    			head.next = new ListNode(l1.val);
    			if(l1 != null) l1 = l1.next;
        	}
        	
            if(l1==null) b1=false;
            if(l2==null) b2=false;

        	head = head.next;
        }
        return l3.next;
    }
}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
