//********************************************************************
//  A prgram of Hi-Lo guess
//********************************************************************
import java.util.*;
public class Hi_Lo
{
    public static void main(String[] args) {
        String play;
        do
        {
        //Declare n1,n2 counters, x as random number & num as input by user
        int n1=0,n2=0,x,num;
        
        //Generate random number between 1 and 100
        Random r = new Random();
        x=r.nextInt(100)+1;
        Scanner scan = new Scanner(System.in);
        
        //For checking
        //System.out.println("Random number:"+x);
        
            //Prompt user to input correct number until the guess is correct or he chooses to quit, the loop will execute at least once
            do
            {
            System.out.println("Enter your guess(1-100) \t (enter -1 to quit):");
            num=scan.nextInt();
            
            //Split into several exclusive cases: out of range but not equal to -1, out of range & equal -1, within range & too high, within range & too low, within range & correct 
            if(num!=-1 && (num < 1 || num >100))
                //No counter for invalid guess
                System.out.println("Out of range.Try again.");
                
            else if (num==-1)
                //Path to end the game without guess
                System.out.println("Welcome to play next time!");
                
            else if (num >= 1 && num <= 100)
                {
                if(num>x){
                System.out.println("Too high");
                n1++;
                }
                
                if(num<x){
                System.out.println("Too low");
                n2++;
                }
                
                if(num==x){
                //sum the valid guess
                int n=n1+n2;
                System.out.println("Correct!"+"You made a total of "+n+" guess");
                }
                }
            }
            while(num!=x && num!=-1);
         
        //Prompt user to play again at end of game. If yes, then return to the loop. If no, pass to the next statement "Bye"
        System.out.println("Do you want to play again? (y/n)");
        play=scan.next();
        }
        while(play.equals("y"));
        System.out.println("Bye");
    }
}