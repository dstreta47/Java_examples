/*
 * This programs demonstrates the use of Switch case with user defined variable
 * 
 */
package switcher;
import java.util.*;
/**
 *
 * @author Amit Rana
 */
public class Switcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x,y;
        x= 4;
        y= 3;
        System.out.println("enter the number you want to compare with switch:");
        Scanner reader= new Scanner(System.in);
        int input= reader.nextInt();
        int temp;
        if(input == 4)
        {temp= x;}
        if(input == 2)
        {temp= x;}
        if(input == 1)
        {temp= x;}
        else
        {temp=y;}
        switch(temp){
            case 1-> System.out.println("red"); 
            case 2-> System.out.println("green"); 
            case 3, 4 -> System.out.println("yellow");
            default ->  System.out.println("nah");
            
                 }
        
        // TODO code application logic here
    }
    
}
