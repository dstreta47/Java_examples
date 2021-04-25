/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex_conditionals;
import java.util.*;
/**
 *
 * @author Amit Rana
 */
public class Complex_Conditionals {

    /**
     * this program searches for string in input
     * && complex conditional evaluates when both conditions are true
     * || (or) operator evaluates when either is true
     */
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("enter the sequence to be read");
        String input= reader.next();
        String sOne= "abc";
        String sTwo= "z";
        /*commented code is for and operator without any boolean
        
        if(input.contains(sOne) && input.contains(sTwo)){
            System.out.println("found it");
        } else{
            System.out.println("Nah");
            }
            */
        //below code evaluates first the bracket enclosed sOne sTwo bool and then compares with &&false which 
        //always yields false when compared with any single conditional statement
        if((input.contains(sOne) || input.contains(sTwo)) && false){
            System.out.println("found it");
        } else{
            System.out.println("Nah");
            }
        // TODO code application logic here
    }
    
}
