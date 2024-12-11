//CodeSoft Task 2

import java.util.*;

public class Task2
{
  public static void main(String args[])
  {
 Scanner sc=new Scanner (System.in);
 System.out.println("Student Grade Calculator");
 System.out.print("Enter number of Subjects :");
 int n=sc.nextInt();
 int total=0;
 for(int i=0;i<n;i++)
   {
    System.out.print("Enter marks get in test"+ (i+1) +":");
    int marks=sc.nextInt();
    total+=marks;
   }//for loop end
   double avg=(double)total/n;//average calculation.
   char Grade;
   if(avg>=90)
    {
    Grade='O';
    }
   else if(avg>=80)
    {
    Grade='A';
    }
   else if(avg>=70)
    {
    Grade='B';
    }
   else if(avg>=60)
    {
    Grade='C';
    }
   else if(avg>=50)
    {
   Grade='D';
    }
   else if(avg>=40)
    {
    Grade='E';
    }
   else
    {
    Grade='F';
    }
  System.out.println("Total Marks:"+ total);
  System.out.println("Average Percentage:"+avg+"%");
  System.out.println("Grade:"+Grade);
  }//main method end.
}//public class end.
 
