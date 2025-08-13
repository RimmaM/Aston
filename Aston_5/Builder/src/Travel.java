class Travel {
    private final String transport;
    private final String ticket;
    private final String time;

    private Travel(Builder b) {
        this.transport = b.transport;
        this.ticket = b.ticket;
        this.time = b.time;
    }

    @Override
    public String toString() {
        return "Транспорт: " + transport + ", билет: " + ticket + ", время в пути: " + time;
    }

    public static class Builder {
        private String transport;
        private String ticket;
        private String time;

        public Builder setTransport(String transport) {
            this.transport = transport;
            return this;
        }

        public Builder setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Travel build() {
            return new Travel(this);
        }
    }
}