import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> actualFlightList = FlightBuilder.createFlights();

        int i = 0;

        for (Flight flight : actualFlightList) {
            System.out.println(i);
            SegmentAnalysys.separateSegment(flight.getSegments(), i);
            i++;
        }

        System.out.println();


    }
}
