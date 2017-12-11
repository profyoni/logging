
import java.util.List;

import static org.mockito.Mockito.*;

public class Mocking {

    public static void main(String[] args) {
        //http://site.mockito.org/
        // mock creation
        List mockedList = mock(List.class);

// using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");
        mockedList.clear();

        // selective, explicit, highly readable verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
    }
