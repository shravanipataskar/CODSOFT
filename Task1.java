//CodeSoft Task 1

import java.util.*;

public class Task1
 {
   public static int getrandN(int min, int max)
        {
         return(int)(Math.random()*(max-min+1)+min);
        }
   public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int trys=5;
      int last=0;
      Boolean playAgain=true;
      System.out.println("Welcome Friend!!");
      System.out.println("You have "+ trys +" opportunities to win the game");
      while(playAgain)
    {
      int rand=getrandN(1,100);
      boolean guess=false;
      for(int i=0;i<trys;i++)
        {
      System.out.print("Chance"+(i+1)+" Try to guess:");
      int u=sc.nextInt();
         if(u==rand)
            {
            guess=true;
            last+=1;
            System.out.println("You are winner!!!");
            break;
            }
         else if(u>rand)
            {
            System.out.println("Sorry it too high");
            }
        else
            {
            System.out.println("Sorry it too low");
            }
         }
         if(guess==false)
           {
            System.out.println("Sorry You lose the game. The number is"+rand);
           }
         System.out.println("Do you like to play game again??(yes/no)");
         String ans=sc.next();
         playAgain=ans.equalsIgnoreCase("yes");
            
      }
      
      System.out.println("That's end friend,hope you enjoy game.");
      System.out.println("Your Score:"+last);
     
    }
  
 }