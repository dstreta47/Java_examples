/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass_example;

/**
 *
 * @author Amit Rana
 */
public class Stringclass_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 'n';
        String a= "hello"; 
        
        
        //one thing that stirng class can do that isn't common is that it can perform concatenation
        String s1= "Hello";
        String s2= "Nah";
        String s3= s1+ s2+ "hey there"; // here we added s1. s2 and the string literal hey there to s3
        System.out.println(s3.toUpperCase());// in this case s3's value of original lower case is not modified
        System.out.println(s3+ "as is shown by this invokcation");
        //instead this just upper casses the system.out.println command's version
        //in order to do the opposite, that is, to actually convert s3 to uppercase we cast it as follow
        
        s3= s3.toUpperCase();
        System.out.println(s3+ "\nhere it should yield the upper cased one"); // here it should yield the upper cased one
        
        // TODO code application logic here
    }
    
}
