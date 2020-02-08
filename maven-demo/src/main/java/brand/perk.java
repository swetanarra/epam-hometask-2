package brand;

public class perk extends brand {

	public perk() {
		super();
		this.brandname="perk";
		this.owner="mondelez international";
		this.cost=10;
		
		// TODO Auto-generated constructor stub
	}
	public int showCost() {
		return this.cost;
	}
	public String toString() {
		return "--perk--\n";
	}
	public void showBrandOwner() {
		String str=brandname + "is owned by"+owner;
		System.out.println(str);
	}

}
