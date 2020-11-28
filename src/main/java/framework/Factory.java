package framework;

public abstract class Factory {
	public final Product create(String ownerName) {
		Product product = createProduct(ownerName);
		return product;
	}

	protected abstract Product createProduct(String ownerName);
}
