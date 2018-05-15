
package UserInput;


import java.util.Scanner;

/**
 *
 * @author envy pc
 */
public class UserInput {

    String c,x;
    int b=10;
    
    void print()
    {
        
        Scanner z = new Scanner(System.in);
        
        System.out.print("Hey Enter The Name:");
        String c =z.next();
        
        
        System.out.print("Hey Enter The password:");
        String x =z.next();
         
        
        if(b==10)
        {System.out.println("nice work");}
        
        else
        {System.out.println("sorry wrong ....its not eaqual to 10");}
        
   // System.out.println(a);
    }
    
    
    public static void main(String[] args) {
        
        UserInput t = new UserInput();
        t.print();
        

    }
    
}
