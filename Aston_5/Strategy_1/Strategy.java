interface GoStrategy {
    void go();
}

class Avia implements GoStrategy {
    public void go() {
        System.out.println("Летим на самолете");
    }
}

class Velo implements GoStrategy {
    public void go() {
        System.out.println("Меняем стратегию на вело");
    }
}