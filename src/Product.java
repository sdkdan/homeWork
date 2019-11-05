import java.util.*;

public abstract class Product implements Item{

    int serialNumber;
    String manufacturer;
    Date manufacuredOn;
    String name;
    static int currentProductionNumber=0 ; // = serialNumber++;
    static ArrayList<Product> products = new ArrayList<>();


    static void addColection(MoviePlayer player){
        products.add(player);
        if(products.size()>1){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
               return o1.name.compareTo(o2.name);
            }
        });
        }
    }

    static void addColection(AudioPlayer player){
        products.add(player);
        if(products.size()>1){
            Collections.sort(products, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
        }
    }

    public Product(String name){
        this.name = name;
        this.serialNumber = currentProductionNumber++;
        //Date date = new Date();
        manufacuredOn = new Date();
    }

//    static Object printType(Object o){
//        if(o instanceof Product){
//            if(o instanceof AudioPlayer){
//                return o;
//            }
//            else if(o instanceof MoviePlayer){
//                return o;
//            }
//        }
//        return  null;
//    }

    @Override
    public void setProductionNumber(int productionNumber) {
        this.currentProductionNumber = productionNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacuredOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "\nManufacturer \t:"+ manufacturer+"\nSerial Number \t:"+serialNumber+"\nDate \t\t\t:"+manufacuredOn+"\nName \t\t\t:"+name;
    }

    public static void  printType (Product product)
    {
        for (Product i: products) {
            if(i instanceof Product){
                System.out.println("\n" + i.toString());
            }
        }
    }

}
