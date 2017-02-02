package tenmax.io.ian;

/**
 * @author ian
 * @since 2017/2/1
 */
public class Finonacci {

    public static int fibonacciFunc(int n) {
        if (n<=1){
            return n;
        }
        else{
            return fibonacciFunc(n-1) + fibonacciFunc(n-2);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i=1;i<= n;i++)
            System.out.println(fibonacciFunc(i));
    }

}
