public class CarStrategy  implements  RouteStrategy{
    @Override
    public String buildRoute(String from, String to) {
        return "Car route: " + from + " -> Highway -> " + to;
    }
}
