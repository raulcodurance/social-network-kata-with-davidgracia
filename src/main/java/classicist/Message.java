package classicist;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {
    private String message;
    private LocalDateTime postedTime;

    public Message(String message, LocalDateTime postedTime) {
        this.message = message;
        this.postedTime = postedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return message.equals(message1.message) &&
                postedTime.equals(message1.postedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, postedTime);
    }
}
