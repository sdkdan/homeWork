public class Calc4_1 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;



    public double findTotal(Double d) {

        originalPrice = Math.round(d*(1+tax+tip)*10.0)/10.0;
        //System.out.println(originalPrice);
        return originalPrice;
        //Calculate an individual's total after tax and tip
        //Print this value
    }
    public double totalAll=0;
    public double findTotal1(double price, String name){
        double total = Math.round((price+45/6.0)*(1+tax+tip)*10.0)/10.0;
        System.out.println(name +": $" +total);
        return totalAll +=total;
    }
}
