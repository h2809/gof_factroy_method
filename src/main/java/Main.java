import facebook.FacebookFactory;
import framework.Factory;
import framework.Product;

public class Main {
	public static void main(String[] args) {
		Factory factory = new FacebookFactory();
		Product product = factory.create("Yoshida");
		product.use();
	}
}
