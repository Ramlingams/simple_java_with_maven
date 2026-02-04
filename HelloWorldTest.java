import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testSayHello() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World", hw.sayHello());
    }
}
