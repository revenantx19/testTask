import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Данный класс выполняет третий фильтр:
 * 3. Перелеты, где общее время, проведённое на земле, превышает два часа
 * (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним).
 */

public class SegmentAnalysisFilterThree {

    public static boolean separateSegment(List<Segment> segmentsList) {
        long countHours = 0;
        for (int i = 0; i < segmentsList.size() - 1; i++) {
            countHours += calculateHoursBetween(
                    segmentsList.get(i).getArrivalDate(),
                    segmentsList.get(i + 1).getDepartureDate()
            );
        }
        return countHours > 2;
    }

    public static long calculateHoursBetween(LocalDateTime start, LocalDateTime end) {
        return Duration.between(start, end).toHours();
    }


}


