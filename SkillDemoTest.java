import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtract(){
        assertEquals(4, SkillDemo.subtract(5, 1)); //fail
    }
}
