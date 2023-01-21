import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.mockito.Mockito.*;



public class MallonExchangeTest {
// we loosely create everything so we can mock, mallonexchange is used as an interface
    // We create a constructor that uses the interface and we use it in our testing mocking the info
    @Mock
  private MallonExchange m;

    @Test
    public void testGetPrice(){
        when(m.getPrice("APPL",40)).thenReturn(100.00);
    }
    


}
