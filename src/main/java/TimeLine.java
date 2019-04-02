import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TimeLine {
    private final List<Message> messages = new ArrayList<>();

    public void post(Message message) {
        this.messages.add(message);
    }

    public List<Message> messages() {
        return Collections.unmodifiableList(messages);
    }
}
