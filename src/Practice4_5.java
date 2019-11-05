import java.util.Random;

public class Practice4_5 {

        public static void main(String[] args) {

            // 50% chance heads, 50% chance tails
            Random rand = new Random();
            int chance = rand.nextInt(3);
            System.out.println(chance);
            if(chance == 0){
                System.out.println("камень");
            }
            else if(chance == 1) System.out.println("бумага");
            else System.out.println("ножницы");
        }
    }


