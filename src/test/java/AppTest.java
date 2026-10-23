import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals(
            "CI/CD Pipeline Successful",
            App.message()
        );
    }
}