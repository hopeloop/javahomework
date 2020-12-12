//9.3 Use the Date class
package W3;
import java.util.Date;

public class Q9_3_Use_the_Date_class {
    public static void main(String[] args) {
        long elapsed_time=10000;
        for(int i=1;i<8;i++){
            elapsed_time = (long) (elapsed_time*10);
            Date date = new Date(elapsed_time);
            System.out.println(date.toString());
        }
    }
}
