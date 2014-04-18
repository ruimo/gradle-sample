package foo;

import org.junit.Test;
import javax.enterprise.inject.InjectionException;
import foo.Foo;

public class BarTest {
    @Test public void test() throws Exception {
        InjectionException e = new InjectionException();
    }
}
