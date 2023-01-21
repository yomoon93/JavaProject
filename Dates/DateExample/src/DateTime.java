import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DateTime {
    public static void main(String[] args) {
//    LocalDate startDate = LocalDate.of(2022,4,24 );
//    LocalDate endDate = LocalDate.of(2022,5,10 );
//        Locale locale = new Locale("fr", "FR");
//        DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
//        String date = dateFormat.format(new Date());
//        System.out.print(date);
        String pattern = "hh:mm";
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat(pattern);
        String date = simpleTimeFormat.format(new Date());
        System.out.println(date);

//        LocalTime now = LocalTime.now();
//        LocalTime limit = LocalTime.parse("15:00");
//        System.out.println(now);
//        System.out.println(limit);
//        System.out.println();
//    long noOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
//    System.out.println(noOfDaysBetween);
//    System.out.println(startDate);
//    System.out.println(nowTime);

    }
}
