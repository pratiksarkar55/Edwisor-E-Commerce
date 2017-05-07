package pkg1;
import pkg1.User.category_of_item_add;

public class Admin extends User implements User.category_of_item_add{


	@Override
	protected int getItemsAdded() {
		
		return itemsAdded;
	}
	
	public void pricing(int price){
		System.out.println("Price with discount is "+price);
	}
	
	public void pricing(int price,String userID){ /**METHOD OVERLOADING                **/
		System.out.println("Price without discount is "+price);
	}
	
	@Override
	public void msg() {
		System.out.println("USER ADDED ELECTRONICS ITEMS");
		
	}

}
