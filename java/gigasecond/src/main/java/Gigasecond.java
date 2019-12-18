import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static long gigaSeconds = 1000000000;
    private LocalDateTime t;

    Gigasecond(LocalDate moment) {
        t = moment.atStartOfDay();
    }

    Gigasecond(LocalDateTime moment) {
        t = moment;
    }

    LocalDateTime getDateTime() {
        return t.plusSeconds(gigaSeconds);
    }

}
