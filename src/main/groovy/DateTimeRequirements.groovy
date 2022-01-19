import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class DateTimeRequirements {
    static void main(args) {
        // requirement - Generate current time in the format - yyyy-MM-dd'T'HH:mm:ss.SSSXXX (GMT minus timezone)

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        String currenttime = ZonedDateTime.now().format(formatter)
        System.out.println(currenttime)
    }


}
