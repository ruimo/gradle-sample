package foo;

import org.junit.Test;
import javax.servlet.http.*;
import foo.Foo;

public class BarTest {
    @Test public void test() throws Exception {
        Cookie cookie = new Cookie("foo", "bar");
    }
}
