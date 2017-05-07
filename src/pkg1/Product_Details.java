package pkg1;
import pkg1.User.category_of_item_add;
import pkg1.User.dateOfDelivery;

public class Product_Details extends User implements User.category_of_item_add,User.dateOfDelivery {
	protected String product_company="Reymonds";
	protected String delivery_date="05/07/2017";

	@Override
	protected int getItemsAdded() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delivery_date() {
		System.out.println("Product would be delivered on "+delivery_date);
		
	}

	@Override
	public void msg() {
		System.out.println("Product company is "+product_company);
		
	}
	
	

}
