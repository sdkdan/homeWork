
package IFelse;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        boolean outOfStock = true;
	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total = (price*quantity)*tax;
	if(outOfStock && quantity > 1)System.out.println(custName +"  wants to purchase "+quantity+ " " + itemDesc + "s total price " + total );
	else if(outOfStock && quantity == 1)System.out.println(custName +"  wants to purchase "+quantity + " " + itemDesc + " total price " + total );
	else if(!outOfStock || quantity == 0)System.out.println("No product");





        
        
    }
    
}


