import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;


public class PostingSocialNetworkShould {


    public static final String HELLO_WORLD = "Hello world!";
    public static final String HELLO_DAVID = "Hello David!";
    public static final String HELLO_JORGE = "Hello Jorge!";
    private LocalDateTime currentTime;
    private LocalDateTime currentTime2;
    private LocalDateTime currentTime3;
    private TimeLine timeLine;
    private Message message;
    private Message message2;
    private Message message3;

    @Before
    public void setUp() {
        currentTime = LocalDateTime.now();
        currentTime2 = currentTime.plusSeconds(10);
        currentTime3 = currentTime.plusSeconds(20);
        timeLine = new TimeLine();
        message = new Message(HELLO_WORLD, currentTime);
        message2 = new Message(HELLO_DAVID, currentTime2);
        message3 = new Message(HELLO_JORGE, currentTime3);
    }

    @Test
    public void
    publish_multiple_messages_to_timeline_prima() {
        timeLine.post(message);
        timeLine.post(message2);
        timeLine.post(message3);

        assertThat(timeLine.messages()).containsExactlyInAnyOrder(new Message(HELLO_WORLD, currentTime)
                , new Message(HELLO_DAVID, currentTime2)
                , new Message(HELLO_JORGE, currentTime3));
    }
}
