      import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
	double pi=Math.PI;
       if(radius<=0)
       {
         System.out.print(" please enter non zero positive number");
       }
	   else
       {
         	perimeter=2*pi*radius;
         	area=pi*radius*radius;
         	System.out.print(perimeter+"\n"+area);
       }
