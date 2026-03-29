import java.util.*;
public class largest3 {
    public static void main(String[]args){
        int a= 10;
        int b = 30;
        int c = 50;
      if(a>=b && a>=c){
          System.out.println("Largest number is:"+a);
      }  
      else if(b>=a && b>=c){
        System.out.println("Largest number is:"+b);
      }
      else{
        System.out.println("Largest number is:"+c);
      }
    }
    
}
