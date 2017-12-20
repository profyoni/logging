

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

interface ITime {
    long getTime();
}

class Clock
{
    private ITime time;
    Clock(ITime time)
    {
        this.time = time;
    }
    public long foo(boolean b)
    {
        if (b){
            return time.getTime();
        }
        else{
            return -1;
        }
    }
}
public class Mocking {

    @Test
    public void test() {
        ITime mockTime = mock(ITime.class);

        Clock clock = new Clock(mockTime);
        when(mockTime.getTime()).thenReturn(100L);
        assertEquals(100, clock.foo(true));

        verify(mockTime).getTime();

        assertEquals(-1, clock.foo(false));



        //http://site.mockito.org/
        // mock creation
 //       List mockedList = mock(List.class);

// using mock object - it does not throw any "unexpected interaction" exception
//        mockedList.add("one");
//        mockedList.clear();
//
//        // selective, explicit, highly readable verification
//        verify(mockedList).add("one");
//        verify(mockedList).clear();
    }
    }
