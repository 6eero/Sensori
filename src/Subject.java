import Exceptions.IllegalCommandException;

public interface Subject {


    /**
     * Method to add a new boat to the list of the boat that will get commands from the control panel
     * @param boat must be != null
     */
    void subscribe(Boat boat);

    /**
     * Method to remove a boat from the list of the boat that will get commands from the control panel
     * @param boat must be != null and must be in the listOfObserveredBoats
     */
    void unsubscribe(Boat boat);

    /**
     * Method to notify all the subscribed boat with the given command
     * @param command must be a legal command
     */
    void notifySubscribedDevices(String command) throws IllegalCommandException;

    /**
     * Method to send a command to a device
     * @param boat the boat to send the command to
     * @param command the command to send to the boat.
     *                It must be "turn on" or "set mothor rpm to 2000"
     */
    void sendCommand(Boat boat, String command) throws IllegalCommandException;

}
