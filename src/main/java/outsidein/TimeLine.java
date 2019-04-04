package outsidein;

import java.util.List;

public class TimeLine {
    private Messages messages;

    public TimeLine(Messages messages) {
        this.messages = messages;
    }

    public void publish(Message message) {

        this.messages.store(message);
    }

    public List<Message> messages() {
        throw new UnsupportedOperationException();
    }
}
