package amazonImplementation;

public class Search {
	
	public String checkProduct(Product prod)
	{
		if(prod.getProductDetails().contains(prod.getProductName()))
				{
					return prod.getProductName();
				}
		
		return "Not found";
	}

}
