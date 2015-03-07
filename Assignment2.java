/**
* assignment2 
* SUM AND AVERAGE
* Likun Ma
* Marh 3nd,2015 
*
*/

import javax.swing.JOptionPane; 
public class Assignment2
{
       public static void main(String[] args)
{




String numberA,numberB,numberC,numberD,numberE; 


     String numberAString = JOptionPane.showInputDialog("Enter the number a:");
      int a = Integer.parseInt(numberAString);  
     String numberBString = JOptionPane.showInputDialog("Enter the number b:");
     int b = Integer.parseInt(numberBString); 
     String numberCString = JOptionPane.showInputDialog("Enter the number c:"); 
     int c = Integer.parseInt(numberCString);
     String numberDString = JOptionPane.showInputDialog("Enter the number d:");
     int d = Integer.parseInt(numberDString); 
     String numberEString = JOptionPane.showInputDialog("Enter the number e:"); 
     int e = Integer.parseInt(numberEString);

     int sum = a + b + c + d + e;
     int average = sum/5;

JOptionPane.showMessageDialog(null,"The sum of five numbers = " + sum + "and the average = " + average);   

}

}



