import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGreeting() {
       assertEquals("Hello from GoCD!", App.greet());   
    }
}