
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {

//Current time
public void currentTime(){
    LocalTime myLocalTime = LocalTime.now();
    System.out.println(myLocalTime);
}

//Current time and date
public void currentTimeAndDate(){
    LocalDateTime myLocalDateTime = LocalDateTime.now();
    System.out.println(myLocalDateTime);
}

//DateTime formatter
public void dateFormatter(){
    LocalDateTime myFormattedDate = LocalDateTime.now();
    DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String foramttedDate = myFormattedDate.format(myFormatter);
    System.out.println(foramttedDate);
}
    
}
