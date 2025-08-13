public class Main {
    public static void main(String[] args) {
        TravelService proxy = new TravelProxy(new RealTravelService());

        proxy.buyTicket("avia");
        proxy.buyTicket("car");
        proxy.buyTicket("velo");
    }
}