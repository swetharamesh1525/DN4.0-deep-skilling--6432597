import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testFetchData() {
        // Arrange: Create a mock for ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject the mock into the service
        MyService service = new MyService(mockApi);

        // Act: Call the method under test
        String result = service.fetchData();

        // Assert: Verify the result matches the stubbed value
        assertEquals("Mock Data", result);

        // Verify that getData was called once
        verify(mockApi, times(1)).getData();
    }
}
