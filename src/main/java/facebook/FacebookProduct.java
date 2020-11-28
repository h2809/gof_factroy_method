package facebook;
import framework.Product;

public class FacebookProduct extends Product {
	private String ownerName;

	FacebookProduct(String ownerName) {
		this.ownerName = ownerName;
	}

	public void use() {
		System.out.println(this.ownerName + " is playing on Oculus Quest 2 now.");
	}
}
