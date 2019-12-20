import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private final static long GIGA_SECONDS = 1_000_000_000;
    private LocalDateTime gigaTime;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        gigaTime = moment.plusSeconds(GIGA_SECONDS);
    }

    LocalDateTime getDateTime() {
        return gigaTime;
    }

}
