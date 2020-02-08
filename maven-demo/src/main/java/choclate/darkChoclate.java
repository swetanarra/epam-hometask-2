package choclate;

public class darkChoclate {
	protected double butter;
	protected double milk;
	protected double choco;
	protected double sugar;
	protected String choclateName;
	protected int cost;

	public darkChoclate() {
		super();
		this.cost=75;
		this.butter=12.04;
		this.milk=7.06;
		this.choco=20.76;
		this.sugar=5.87;
		this.choclateName="darkChoclate";
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
		return "--darkChoclate--\n";
	}
	

}
