public class Navigator {
    private RouteStrategy route;

    public Navigator(RouteStrategy route){
        this.route = route;
    }

    public void setStrategy(RouteStrategy route){
        this.route = route;
    }

    public String buildRoute(String from, String to){
        return route.buildRoute(from, to);
    }
}