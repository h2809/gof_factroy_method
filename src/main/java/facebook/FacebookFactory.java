package facebook;
import framework.Factory;
import framework.Product;

public class FacebookFactory extends Factory {
	protected Product createProduct(String ownerName) {
		return new FacebookProduct(ownerName);
	}
}
