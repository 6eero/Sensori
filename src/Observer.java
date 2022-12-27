import Exceptions.IllegalCommandException;

public interface Observer {

    void update(String command) throws IllegalCommandException;

    void subscribeCP(ControlPanel cp);
}
