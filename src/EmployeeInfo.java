import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {
    StringBuilder name;
    String code;
    String deptId;
    Pattern p;
    Scanner in;


    public String getDeptId(){
        return deptId;
    }


    private void setDeptId(String deptId){
        this.deptId = deptId;
    }


//    private String getId(){
//        return id
//    }
//
//
//
//    private boolean validId(String id){
//
//    }


    public EmployeeInfo(){
        setName(inputName());
        if(checkName(name)){
           createEmployeeCode(name);
       }
       else {
            code = name.charAt(0) + "guest";
        }
    }


    public StringBuilder getName(){
        return name;
    }


    public String getCode(){
        return code;
    }


    private void setName(StringBuilder name){
        this.name = name;
    }


    private void createEmployeeCode(StringBuilder name){
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                code = name.charAt(0) + name.substring(i+1, name.length());
                return;
            }
//            else{
//                code = name.charAt(0) + "guest";
//            }
        }

    }


    private StringBuilder inputName(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       try {
           name = new StringBuilder(reader.readLine());
           reader.close();
       }catch (IOException e ){
           e.printStackTrace();
       }
       return name;
    }


    private boolean checkName(StringBuilder name){
        return  name.toString().contains(" ");
        //return false;
    }
}
