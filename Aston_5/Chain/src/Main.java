public class Main {
    public static void main(String[] args) {
        Handler ticket = new TicketAvia(new TicketCar(null));
        ticket.handler("Avia");
        ticket.handler("Car");
        ticket.handler("Вело");
    }
}
