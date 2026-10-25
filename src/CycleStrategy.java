public class CycleStrategy implements RouteStrategy{
    @Override
    public String buildRoute(String from, String to) {
        return "Cycling route: " + from + " -> Cycle lane -> " + to;
    }
}
