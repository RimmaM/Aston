interface Handler {
    void setHandler(Handler next);
    void handler(String request);
}