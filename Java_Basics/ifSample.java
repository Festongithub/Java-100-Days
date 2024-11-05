
/**
 * tes the if flow statement
 * the for of loop in java is one similar to C
 * 
 **/

class IfSample{
    public static void main(String args[]){
        int x, y;
        x = 10;
        y = 20;

        char ch1, ch2;
        ch1 = 89;
        ch2 = 'Y';
        System.out.print("ch1 and ch2:");

        int i;
        for(i = 0; i<10; i++){
            System.out.println("This is the x:" + x);
        }

         if(x < y) System.out.println("x is less than y"); 
        x = x * 2;
        if(x == y) System.out.println("x is equal to y");
        if(y > x) System.out.println("y is more than x");
    }
}