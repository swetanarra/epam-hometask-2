package brand;

public class munch extends brand {

	public munch() {
		super();
		this.brandname="munch";
		this.owner="nestle";
		this.cost=10;
		// TODO Auto-generated constructor stub
	}
	public int showCost() {
		return this.cost;
	}
	public String toString() {
		return "--munch--\n";
	}
	public void showBrandOwner() {
		String str=brandname + "is owned by"+owner;
		System.out.println(str);
	}

}
