
public class Bank implements Comparable<Bank>{
	
	private int amount;
	
	Bank(int a) {
		this.amount = a;
	}

	@Override
	public int compareTo(Bank obj) {
		// TODO Auto-generated method stub
		if(this.amount == obj.amount) return 0;
		else if(this.amount > obj.amount) return 1;
		else return -1;
	}

}
