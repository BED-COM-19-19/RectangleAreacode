//The code written by bed-com-19-19 Alexious Malamba
import java.util.*;

//creating a rectangle class

class Rectangle
{
   int area, length, breadth; 
   Rectangle() 
   {
      //Creating scanner variable 
      Scanner input = new Scanner(System.in);
      //Asking user for input for breadth
      System.out.println("Enter Rectangle breadth: ");
      breadth = input.nextInt();
      //Asking user for input for lenth
      System.out.println("Enter Rectangle length: ");
      //storing user's enter into input
      length = input.nextInt();
   }
   //a return method for finding area 
   void returnArea() 
   { 
      area = length * breadth; 
      System.out.println("Area of Rectangle : " + area); 
   }  
}


//main class

public class RectangleArea
{
   public static void main(String[] args) 
   {
      //creating an object 
      Rectangle rm = new Rectangle(); 
      rm.returnArea();
   }
}
// Coding is fun indeed and I love programming things.