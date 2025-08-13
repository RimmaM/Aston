class TravelDecorator implements TravelService {
    private TravelService decoratedTravel;

    public TravelDecorator(TravelService travelService) {
        this.decoratedTravel = travelService;

    }

    public void buyTicket(String type){
        decoratedTravel.buyTicket(type);
        addService();
    }

    public void addService(){
        System.out.println("Добавить Багаж");
    }
}