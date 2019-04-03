package outsidein;

import java.util.Objects;

public class Message {
    private String userId;
    private String message;

    public Message(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return userId.equals(message1.userId) &&
                message.equals(message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, message);
    }

    public String userId() {
        return userId;
    }
}

