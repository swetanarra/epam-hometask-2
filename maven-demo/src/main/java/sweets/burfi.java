package sweets;

public class burfi extends kalakand {

	public burfi() {
		super();
		this.sweetName="burfi";
		this.sugar=21.90;
		this.milk=11.0;
		this.water=10.25;
		this.cost=120;
		// TODO Auto-generated constructor stub
	}
	public int showCost() {
		return this.cost;
	}
	public void showContent() {
		System.out.println("the burfi content is:");
		System.out.println("sugar content:"+sugar);
		System.out.println("milk content:"+milk);
		System.out.println("water content:"+water);
	}
	public String toString() {
		return "--burfi--\n";
	}
	


}
