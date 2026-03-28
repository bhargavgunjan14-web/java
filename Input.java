import java.util.*;
public class Input {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //to input a single word string
    String input = sc.next();
    System.out.println(input);
    //to input a line 
    String s = sc.nextLine();
    System.out.println(s);
    //to input an integer value
    int n =sc.nextInt();
    System.out.println(n);
    //input a folat value
    float f=sc.nextFloat();
    System.out.println(f);
    // same for boolean nextBoolean, nextShort, nextDouble    
    }
}
