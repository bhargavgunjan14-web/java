/*: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/
import java.util.*;
public class ques3 {
    public static void main(String[]args){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter cost of pencil: ");
     float pencil =sc.nextFloat();
     System.out.println("Enter cost of pen: ");
     float pen = sc.nextFloat();
     System.out.println("Enter cost of eraser: ");
     float eraser = sc.nextFloat();
     float total = pencil+pen+eraser;
     float gst = total*0.18f;
     float  bill = total+gst;
     int $ =20;//ques4 no error after $
     System.out.println($);
     System.out.println("Total cost :"+total );
     System.out.println("Gst applied:"+gst);
     System.out.println("Total bill after applied gst:"+bill);
  }
}
