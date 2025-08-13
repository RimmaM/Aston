class RealTravelService implements TravelService {
    private final String type;

    public RealTravelService(String type) {
        this.type = type;
    }

    public void buyTicket(String type) {
        System.out.println(type + " купить билет");
    }
}