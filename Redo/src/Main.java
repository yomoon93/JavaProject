import java.text.ParseException;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String Date1 = "31/12/2022";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Date1);
        System.out.println(date1);

        LocalDate myDate = LocalDate.of(2020,9,11);
        LocalDate sixtyDaysBehind = LocalDate.of(2020,9,23);
        Period period = Period.between(myDate, sixtyDaysBehind);


        System.out.println(period);


    }
}
