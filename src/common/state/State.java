package common.state;

public interface State<C extends Context<C>> {
    void handle(C context);
}
