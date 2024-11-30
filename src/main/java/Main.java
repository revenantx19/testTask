import java.util.ArrayList;
import java.util.List;

/**
 * Данное приложение исключает из тестового набора перелёты по следующим правилам
 * (по каждому правилу нужен отдельный вывод списка перелётов):
 * 1. Вылет до текущего момента времени (нужно сравнить текущее время и время вылета getDepartureDate()
 * 2. Сегменты с датой прилёта раньше даты вылета.
 * 3. Перелеты, где общее время, проведённое на земле, превышает два часа
 * (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним).
 */


public class Main {
    public static void main(String[] args) {

        List<Flight> actualFlightList = new ArrayList<>(FlightBuilder.createFlights());
        System.out.println("Первичное состояние:");
        actualFlightList.forEach(System.out::println);

        actualFlightList.removeIf(flight -> SegmentAnalysisFilterOne.separateSegment(flight.getSegments()));
        System.out.println("\nСостояние после применения фильтра №1:");
        actualFlightList.forEach(System.out::println);

        actualFlightList.removeIf(flight -> SegmentAnalysisFilterTwo.separateSegment(flight.getSegments()));
        System.out.println("\nСостояние после применения фильтра №2:");
        actualFlightList.forEach(System.out::println);

        actualFlightList.removeIf(flight -> SegmentAnalysisFilterThree.separateSegment(flight.getSegments()));
        System.out.println("\nСостояние после применения фильтра №3:");
        actualFlightList.forEach(System.out::println);

    }
}
