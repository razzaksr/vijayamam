package dayten.mvc;

public class ProductNotRequiredException extends Exception
{
	public ProductNotRequiredException()
	{
		super("Retailer not required this product");
	}
}
