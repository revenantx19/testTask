import java.time.LocalDateTime;
import java.util.List;

/**
 * Данный класс выполняет первый фильтр:
 * 1. Вылет до текущего момента времени (нужно сравнить текущее время и время вылета getDepartureDate()
 */

public class SegmentAnalysisFilterOne {

    public static boolean separateSegment(List<Segment> segments) {
        return segments.stream().anyMatch(SegmentAnalysisFilterOne::checkDepartureTimeAndNowTime);
    }

    public static boolean checkDepartureTimeAndNowTime(Segment seg) {
        return seg.getDepartureDate().isBefore(LocalDateTime.now());
    }
}
