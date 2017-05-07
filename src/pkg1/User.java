package pkg1;

public abstract class User {
	protected String mail_ID;
	protected int phone_number;
	public int itemsAdded;
	String Address;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail_ID() {
		return mail_ID;
	}
	public void setMail_ID(String mail_ID) {
		this.mail_ID = mail_ID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	protected abstract int getItemsAdded();
	
	public void setItemsAdded(int itemsAdded) {
		this.itemsAdded = itemsAdded;
	}
	
	public int getPhoneNumber() {
		return  phone_number;
	}
	public void setPhoneNumber(int  phone_number) {
		this. phone_number =  phone_number;
	}
	interface category_of_item_add{
		void msg();
	}
	
	interface dateOfDelivery{
		void delivery_date();
	}
	
}
