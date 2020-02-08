package choclate;

public class whiteChoclate extends darkChoclate {

	public whiteChoclate() {
		super();
		this.cost=90;
		this.butter=23.9;
		this.milk=20.34;
		this.choco=12.65;
		this.sugar=10.21;
		this.choclateName="whiteChoclate";
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
		return "--whiteChoclate--\n";
	}

}
