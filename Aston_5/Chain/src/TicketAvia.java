public class TicketAvia extends Travel{
    public TicketAvia(Handler handler){
        super(handler);
    }

    @Override
    public void handler(String request) {
        if(request.equals("Avia")){
            System.out.println("Тикет на самолет");
        } else if (handler != null){
            handler.handler(request);
        } else {
            System.out.println("Поедем на вело, и так сойдет)" );
        }
    }
}