package outsidein;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TimeLineShould {

    private TimeLine timeLine;
    @Mock Messages messages;

    @Before
    public void setUp() {
        this.timeLine = new TimeLine(messages);
    }

    @Test
    public void
    publish_a_message() {
        timeLine.publish(new Message("userId", "Hello Raul!"));

        verify(messages).store(new Message("userId", "Hello Raul!"));
    }
}