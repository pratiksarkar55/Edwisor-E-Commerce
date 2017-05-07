package pkg1;
public class Price_With_Tax extends Admin {
		protected double vat=50.45;
		public double actual_price;
		public void pricing(int price){/** METHOD OVERRIDING               **/
			super.pricing(price);
			actual_price=price+vat;
			System.out.println("Actual price of the items are "+actual_price);
			
		}

	}
