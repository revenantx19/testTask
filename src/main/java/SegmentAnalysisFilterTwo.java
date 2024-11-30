import java.util.List;

/**
 *  * Данный класс выполняет второй фильтр:
 * 2. Сегменты с датой прилёта раньше даты вылета.
 */


public class SegmentAnalysisFilterTwo {

    public static boolean separateSegment(List<Segment> segments) {
        return segments.stream().anyMatch(SegmentAnalysisFilterTwo::checkDepartureDateAndArrivalDate);
    }

    public static boolean checkDepartureDateAndArrivalDate(Segment seg) {
        return seg.getDepartureDate().isAfter(seg.getArrivalDate());
    }

}
