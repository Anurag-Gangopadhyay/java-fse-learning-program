import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

  @Test
  public void testExternalApi() {
    // Step 1: Create mock object
    ExternalApi mockApi = Mockito.mock(ExternalApi.class);

    // Step 2: Stub method
    when(mockApi.getData()).thenReturn("Mock Data");

    // Step 3: Inject mock into service
    MyService service = new MyService(mockApi);

    // Step 4: Call service method and assert result
    String result = service.fetchData();
    assertEquals("Mock Data", result);
  }
}
