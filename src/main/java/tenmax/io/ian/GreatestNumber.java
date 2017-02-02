package tenmax.io.ian;

/**
 * @author ian
 * @since 2017/2/1
 */
public class GreatestNumber {
    public static void main(String[] args) {
        int m =1000;
        int n = 495;
        int Gnumber = 0;
        for(int i=1;i<=n;i++){
            if(m%i == 0){
                if(n%i == 0){
                    Gnumber = i;
                }
            }
        }
        System.out.println(Gnumber);
    }
}
