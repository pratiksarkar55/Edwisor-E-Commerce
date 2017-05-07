

public class Admin extends User implements User.category_of_item_add{


	@Override
	protected int getItemsAdded() {
		
		return itemsAdded;
	}
	
	protected void pricing(int price){
		System.out.println("Price with discount is "+price);
	}
	
	protected void pricing(int price,String userID){ /**METHOD OVERLOADING                **/
		System.out.println("Price without discount is "+price);
	}
	
	@Override
	public void msg() {
		System.out.println("USER ADDED ELECTRONICS ITEMS");
		
	}

}
