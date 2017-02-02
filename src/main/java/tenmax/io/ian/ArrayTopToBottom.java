package tenmax.io.ian;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ian
 * @since 2017/2/1
 */
public class ArrayTopToBottom {

    public static void main(String[] args) {

        int[] number={70,80,31,37,10,1,48,60,33,80};
        Arrays.sort(number);
        for(int x:number){
            System.out.print(x);
            System.out.print(",");
        }
    }

}
