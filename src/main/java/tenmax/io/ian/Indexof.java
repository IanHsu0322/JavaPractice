package tenmax.io.ian;
import java.util.Arrays;

/**
 * @author ian
 * @since 2017/2/1
 */
public class Indexof {

    public static void main(String[] args) {
        int[] number={70,80,31,37,10,1,48,60,33,80};
        Arrays.sort(number);
        int indexOf = Arrays.binarySearch(number, "37");
        System.out.println(indexOf);
    }
}
