package sweets;

public class kalakand {
	protected double sugar;
	protected double milk;
	protected double water;
	protected double flavour;
	protected String sweetName;
	protected int cost;
	public kalakand() {
		super();
		this.sweetName="kalakand";
		this.sugar=15.0;
		this.milk=20.0;
		this.water=12.25;
		this.cost=100;
		// TODO Auto-generated constructor stub
	}
	public int showCost() {
		return this.cost;
	}
	public void showContent() {
		System.out.println("the kalakand content is:");
		System.out.println("sugar content:"+sugar);
		System.out.println("milk content:"+milk);
		System.out.println("water content:"+water);
	}
	public String toString() {
		return "--kalakand--\n";
	}
	

}
