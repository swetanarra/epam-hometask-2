package sweets;

public class basundi extends kalakand{

	public basundi() {
		super();
		this.sweetName="basundi";
		this.sugar=30.80;
		this.milk=25.56;
		this.water=15.09;
		this.cost=150;
		// TODO Auto-generated constructor stub
	}
	public int showCost() {
		return this.cost;
	}
	public void showContent() {
		System.out.println("the basundi content is:");
		System.out.println("sugar content:"+sugar);
		System.out.println("milk content:"+milk);
		System.out.println("water content:"+water);
	}
	public String toString() {
		return "--basundi--\n";
	}
	
		// TODO Auto-generated constructor stub
	}


