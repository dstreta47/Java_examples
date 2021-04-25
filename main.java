/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifexample;
import java.util.Scanner;
/**
 *
 * @author Amit Rana
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        //String input= reader.next();
        //System.out.println(input); // 
        System.out.println("Enter value:");
        int input1= reader.nextInt();
        if(input1 <10)
        {
            System.out.println("More!");
        }
        if(input1 >=10)
        {
        System.out.println("Less!");
        }
        
        //Another example using .equals to which is used to compare input of same type
        System.out.println("enter the value for a string");
        String input3= reader.next();
        if(input3.equals("password")){System.out.println("Yes");} else{System.out.println("No");}
    }
    
}
