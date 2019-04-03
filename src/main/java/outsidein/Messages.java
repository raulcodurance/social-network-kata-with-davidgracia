package outsidein;

import java.util.List;

public interface Messages {
    List<Message> findBy(String userId);

    void store(Message message);
}
