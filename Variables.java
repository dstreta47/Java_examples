package variables;
public class Variables {

    public static void main(String[] args) {
        /*Common mathematical operation */
        int x; 
        x=4;
        int y;
        y=5;
        
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        /*NEgative number cases */
        int a; 
        x=-4;
        int b;
        y=5;
        
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        
        /* edge case for max of int val to be turned into negative if plus 1*/
        int maxnum=2147483647;
        maxnum++;
        System.out.println(maxnum);
        
        /* instead we use long to declare such a varaible*/
        long maxnum_def;
        maxnum_def= 2147483647;
        maxnum_def ++;
        System.out.println(maxnum_def);
    }
    
}
