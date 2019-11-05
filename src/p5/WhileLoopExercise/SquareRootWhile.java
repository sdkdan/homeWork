
package WhileLoopExercise;

import java.io.*;


public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	try{
	    while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if(number >= 0){
                System.out.println(Math.sqrt(number));
                break;
            }else{
                System.out.println(number + " is not correct, enter another number");
            }
        }
    }catch (IOException e){
	    e.printStackTrace();
    }

	
    
}
    
}
