package choclate;

public class milkChoclate extends darkChoclate {

	public milkChoclate() {
		super();
		this.cost=120;
		this.butter=10.98;
		this.milk=23.65;
		this.choco=12.98;
		this.sugar=12.0;
		this.choclateName="milkChoclate";
		// TODO Auto-generated constructor stub
	}
	public int showCost() {
		return this.cost;
	}
	public void showContent() {
		System.out.println("the darkChoclate content is:");
		System.out.println("butter content:"+butter);
		System.out.println("milk content:"+milk);
		System.out.println("choco content:"+choco);
		System.out.println("sugar content:"+sugar);
	}
	public String toString() {
		return "--milkChoclate--\n";
	}
	

}
