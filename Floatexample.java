/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatexample;

/**
 *
 * @author Amit Rana
 */
public class Floatexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iNumber= 3;
        float b_has= 123.5f;/* have to explicitly type float as we use sister def of double*/
        System.out.println(b_has+4.133f);
        //following example will see typecasting to convert an other wise faulty rounding zero phenomenon in variable related 
        int iNumber2= 6; /*here inumber and inumber 2 division would've yielded a zero on a regular*/
        float fnumber= (float)iNumber/iNumber2;// explicitly typecasting int result to float
        System.out.println(fnumber);
        // TODO code application logic here
        
        //Working with doubles here, with twice the precision atleast
        double d1;
        d1=3.1456;
        double d2;
        d2= 5.1267;
        float f2= ((float)(d1/d2));
        System.out.println(f2);
    }
    
}
