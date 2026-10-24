public class WalkStrategy implements RouteStrategy{
    @Override
    public String buildRoute(String from, String to) {
        return "Walking route: " + from + " -> Footpath -> " + to;
    }
}
