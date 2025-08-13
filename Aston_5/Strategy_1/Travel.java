class Travel {
    private GoStrategy strategy;

    public Travel(GoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(GoStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.go();
    }
}