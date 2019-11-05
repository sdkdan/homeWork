import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i;
        double d,roubles,dollars,sqrt;

        try{
            System.out.println("Жил был колобок, выберите его цвет");
            s = reader.readLine();
            System.out.println("у колобка был цвет "+s+" ,побежал колобок в деревню домой к бабушке или дедушке, выберите куда");
            s = reader.readLine();
            System.out.println("побежал колобок в "+ s+" встретил он волка, выберите, будут ли они дружить, или волк съест колобка");
            s = reader.readLine();
            System.out.println("вы выбрали участь колобка: " + s);


            //System.out.println("введите строку");
//            s = reader.readLine();
//            System.out.println("введите целое число");
//            i = Integer.parseInt(reader.readLine());
//            System.out.println("введите вещественное число");
//            d = Double.parseDouble(reader.readLine());
//            System.out.println("введите рубли для пересчета в доллары");
//            roubles = Double.parseDouble(reader.readLine())/65.49;
//            System.out.println(roubles);
//            System.out.println("введите доллары для пересчета в рубли");
//            dollars = Double.parseDouble(reader.readLine());
//            roubles = dollars*65.49;
//            System.out.println(dollars+" Долларам равно "+roubles+" рублей");
//            System.out.println("Получения корня числа");
//            sqrt = Math.sqrt(Double.parseDouble(reader.readLine()));
//            System.out.println(sqrt);
////            System.out.print(9/4);
////            System.out.print(9/4.0);



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
