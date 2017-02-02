package tenmax.io.ian;

/**
 * @author ian
 * @since 2017/2/1
 */
public class Armstrong {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int hundreds = i/100;
            int tens = i%100/10;
            int units = i%10;
            double armstrong = Math.pow(hundreds,3)+Math.pow(tens,3)+Math.pow(units,3);
            if(armstrong == i)
                System.out.println((int) armstrong);
        }
    }
}
