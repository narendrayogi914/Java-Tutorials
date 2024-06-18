import java.time.*;

public class DateTimeJodaApi {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int day = date.getDayOfMonth();
        System.out.println(day);
        int month = date.getMonthValue();
        System.out.println(month);
        int year = date.getYear();
        System.out.println(day + "/" + month +"/"+ year);




        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int sec = time.getSecond();
        int min = time.getMinute();
        System.out.println(time + " " + hour + " " + sec + " " + " " + min);
    }
}
