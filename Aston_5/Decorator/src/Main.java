public class Main {
    public static void main(String[] args) {
        TravelService avia = new RealTravelService("Avia");
        TravelService decoratedAvia = new TravelDecorator(avia);

        avia.buyTicket("Avia");
        decoratedAvia.buyTicket("avia");

    }
}