package pkg2;
import pkg1.Price_With_Tax;
import pkg1.Product_Details;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Price_With_Tax ad= new Price_With_Tax();
		ad.setMail_ID("pratiksarkar@gmail.com");
		ad.setPhoneNumber(893160601);
		ad.setAddress("Kolkata");
		ad.setItemsAdded(5);
		System.out.println("Email="+ad.getMail_ID()+" "+"Phone Number="+ad.getPhoneNumber()+" "+"Adress="+ad.getAddress()+" "+"Items Added="+ad.itemsAdded);
	
		ad.msg();
         ad.pricing(5000,"pratiksarkar.573@gmail.oom");
        ad.pricing(4500);
        
        Product_Details pd= new Product_Details();
        pd.delivery_date();
        pd.msg();
	}

}
