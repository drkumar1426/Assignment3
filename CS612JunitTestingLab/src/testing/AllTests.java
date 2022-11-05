package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ countTest.class, divideTest.class, squareTest.class })
public class AllTests {

}
