package kata1_ade;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    int getAge() {        
        Calendar now = GregorianCalendar.getInstance();
        return millisecondsToYears(now.getTimeInMillis() - birthdate.getTimeInMillis());
    }

    private int millisecondsToYears(long l) {
        long MillisecondsPerYear = (long) (365.25*24*60*60*1000);        
        return (int) (l/MillisecondsPerYear);
    }
    
    
    
    
    
    
}
