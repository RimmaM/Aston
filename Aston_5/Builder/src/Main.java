public class Main {
    public static void main(String[] args) {
        Travel aviaTravel = new Travel.Builder()
                .setTransport("Avia")
                .setTicket("Business class")
                .setTime("2 часа")
                .build();

        Travel carTravel = new Travel.Builder()
                .setTransport("Car")
                .setTicket("No tickets")
                .setTime("24 часа")
                .build();

        System.out.println(aviaTravel);
        System.out.println(carTravel);
    }
}