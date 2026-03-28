import java.util.*;
public class typecasting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float marks =99.999f;
        int marks2 = (int)marks;//type casting or explicit conversion
        System.out.println(marks2);
        char ch='a';
        int number =ch;
        System.out.println(number);//ascii code output
        String s="My name is Gunjan";
       // int num = s; not allowed in java because numberformatexception
        System.out.println(s);
        char a='a';
        char b='b';
        System.out.println(b-a);//type promotion 
       // char c=b-a; error bcz directly cannot convert
         System.out.println((int)(a));
         System.out.println((int)(b));
         int x=10;
         float y=2.5f;
         long c=25;
         double d=30;
         double ans=x+y+c+d;
         System.out.println(ans);

    }
}