package outsidein;

public class PostingAction {

    private TimeLine timeLine;

    public PostingAction(TimeLine timeLine) {
        this.timeLine = timeLine;
    }

    public void post(String userId, String rawMessage) {
        Message message = new Message(userId, rawMessage);

        timeLine.publish(message);
    }
}
