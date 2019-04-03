package outsidein;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class MessagesShould {

    private Messages messages;

    @Before
    public void setUp() {
        this.messages = new InMemoryMessages();
    }

    @Test
    public void
    store_a_message_for_a_userId() {
        messages.store(new Message("userId", "Hello Raul!"));

        assertThat(messages.findBy("userId"))
                .contains((new Message("userId", "Hello Raul!")));
    }

    private class InMemoryMessages implements Messages {
        private List<Message> messages = new ArrayList<>();

        @Override
        public List<Message> findBy(String userId) {
            return this.messages.stream()
                    .filter(message -> userId.equals(message.userId()))
                    .collect(toList());
        }

        @Override
        public void store(Message message) {
            this.messages.add(message);
        }
    }
}