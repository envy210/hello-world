import java.util.Scanner;


public class Add2Numbers{


    public static void main(String[] args){
        int FirstNo = 5;
        int SecondNo = 5;
        int Total = FirstNo + SecondNo;
        // %s is used as place holder to be replaced by specific variable in order below
        String sf1 = String.format(" %s+%s = %s", FirstNo, SecondNo, Total);  
        System.out.println(sf1);
      

         
    }
}
