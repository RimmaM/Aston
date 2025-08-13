public class TicketCar extends Travel{
    public TicketCar(Handler handler){
        super(handler);
    }

    @Override
    public void handler(String request) {
        if(request.equals("Car")){
            System.out.println("На своей машине");
        } else if (handler != null){
            handler.handler(request);
        } else {
            System.out.println("Поедем на вело, и так сойдет)" );
        }
    }
}