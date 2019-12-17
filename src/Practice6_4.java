import java.util.ArrayList;

public class Practice6_4 {
    public static void main(String[] args) {
        String[] names = new String[]{"Vasya","Stas","Den","Dima","Nikita"};

        //int f[]=new int[]{1,2};



        for (int left = 0; left < names.length; left++) {
            int minInd = left;
            for (int i = left; i < names.length; i++) {
                if (names[i].compareTo(names[minInd])>0) {
                    minInd = i;
                }
            }
            swap(names, left, minInd);
        }

        System.out.println(names.toString());

        for (String a: names
             ) {
            System.out.println(a);
        }

    }
    public static void swap (String[] a, int b,int c){
        String tmp = a[c];
        a[c] = a[b];
        a[b] = tmp;
    }
}
