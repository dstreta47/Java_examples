/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;


public class Homework3 {

    public static void main(String[] args) {
        int i;
	/*
	Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".
	 */
        for(i=0; i<=100; i++){
            //combo multiple of 3 n 5
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");

            }

            //condition 1 multiple of 3
            else if (i%3==0){
                System.out.println("fizz");

            }
            //condition 2 multiple of 5
            else if (i%5==0){
                System.out.println("buzz");

            }
            else if(((((i%2!=0 && i%3!=0) && i%5!=0) && i%7!=0)&& i%i==0))
            {
                System.out.println(i+ " This is a prime number");
            }

            // sle print the number
            else {
                if(i==2){System.out.println(i+ " this is a prime number");}
                else if(i==3){System.out.println(i+ " this is a prime number");}
                else if(i==5){System.out.println(i+ " this is a prime number");}
                else if(i==7){System.out.println(i+ " this is a prime number");}
                else{System.out.println(i);}

            }
        }
    }
}
