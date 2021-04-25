/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop_example;

/**
 *
 * @author Amit Rana
 */
public class Forloop_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /*a for loop devices a simpler route to perform actions wihtin the constraints of 
       3 clauses; these are ( in order) The initializer, the loop condition/function and the modifier
       For loop provides elegant solution for problems where we need isolated solutions that carry 
       the behaviour of a code subset, for instance, a for loop to print a 100 number list would be much
       simpler to express in for loop than in a while loop where manual increment has to be set in function
        clause itself.
        */
       // notice the below code, where the output is offset by 1, in programming these mistakes are
       // called offset by 1 and are pretty common mistakes 
       int i;
       for(i=0; i<100; i++){
                            System.out.println(i); // prints from 0 to 99 instead of 1 to 100
                            }
       for(i=1; i<=100; i++){
                            
                            switch(i){
                                case 1-> System.out.println(i+" "+"Corrected one as 1st number");
                                case 2-> System.out.println(i+" "+ "ah 2");
                                // can also use
                                //case 3-> {if(i!=1 && i!=2){System.out.println(i);}else{continue;}}
                                default-> System.out.println(i);
                            }
                            }
    }
    
}
