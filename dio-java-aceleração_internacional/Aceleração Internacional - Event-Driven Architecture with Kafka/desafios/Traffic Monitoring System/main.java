import java.util.Scanner;

public class TrafficMonitoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trafficEvent = scanner.nextLine();

        String alternativeRoute = suggestAlternativeRoute(trafficEvent);

        System.out.println(alternativeRoute);
    }

    private static String suggestAlternativeRoute(String trafficEvent) {
        switch (trafficEvent) {
          case "Accident":
              return "Main road blocked. Use the secondary route.";
          case "Congestion":
              return "Avoid the main highway; use the secondary road.";
          case "Normal Traffic":
              return "Normal traffic on the main route. Continue on it.";
          default:
              return "Invalid traffic event.";
        }
    }
}