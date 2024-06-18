import java.util.Date;
import java.util.TimeZone;;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long timeInMS = date.getTime();



        java.sql.Date dt = new java.sql.Date(timeInMS);
        System.out.println(dt);

        
    }
}
