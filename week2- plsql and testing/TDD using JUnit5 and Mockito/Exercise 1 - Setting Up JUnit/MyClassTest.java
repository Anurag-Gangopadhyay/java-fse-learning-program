import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testAdd() {
        MyClass obj = new MyClass();
        assertEquals(5, obj.add(2, 3));
    }
}
