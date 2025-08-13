public class Main {
    public static void main(String[] args) {
        Travel travel = new Travel(new Avia()); // на самолете
        travel.travel();
        travel.setStrategy(new Velo());
        travel.travel();
    }
}