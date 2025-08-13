class TravelProxy implements TravelService {
    private RealTravelService realTravelService;

    public TravelProxy(RealTravelService realTravelService) {
        this.realTravelService = realTravelService;
    }

   public void buyTicket(String type){
        if (type.equals("avia")){
            System.out.println(realTravelService);
            realTravelService.buyTicket(type);
        } else {
            System.out.println("Ошибка: покупка билета " + type + " невозможна");
        }
   }
}