package outsidein;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PostingSocialNetworkFeature {

    public static final String HELLO_RAUL = "Hello Raul";
    public static final String USER_ID = "userId";
    private PostingAction postingAction;
    private Message message;
    @Mock Messages messages;

    @Before
    public void setUp() {

        this.message = new Message(USER_ID, HELLO_RAUL);
        TimeLine timeLine = new TimeLine(messages);
        this.postingAction = new PostingAction(timeLine);
    }

    @Test
    public void
    user_can_publish_message_to_a_personal_timeline() {
        postingAction.post(USER_ID, HELLO_RAUL);

        verify(messages).store(message);
    }
}
