abstract class Travel implements Handler{
    protected Handler handler;

    public Travel(Handler handler){
        this.handler = handler;
    }

    protected Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler next) {
        this.handler = next;
    }
}