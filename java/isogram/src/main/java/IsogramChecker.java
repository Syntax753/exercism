import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Map<String, Long> freq = phrase.toLowerCase().chars().mapToObj(String::valueOf).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean repeat = freq.values().stream().anyMatch(cnt -> cnt > 1);
        return !repeat;
    }
}
