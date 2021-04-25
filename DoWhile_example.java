/*
 * 
 */
package dowhile_example;
import java.util.*;
/**
 *
 * @author Amit Rana
 */
public class DoWhile_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        String input;
        String all="";
        
        /* Do is used to first as without using is, a simple While loop would yield a 
        compile error, this is due to the fact that the loop uses input
        a variable that for the first pass of the simple while loop does not yet have 
        a value initialized to it, further, it is uninitiated. to circumvent this,
        we could've simply initiated 'input= ""', however, this is an inefficient solution; 
        instead, we prefer to perform a do,while loop where the do part executes a condition 
        without any restrictions the first time. the 'check' happens at the end of the loop in while
        */
        do{
            input = reader.nextLine();
            all += input;
            }while(!input.contains("stop"));
        System.out.println(all);
        // TODO code application logic here
    }
    
}
