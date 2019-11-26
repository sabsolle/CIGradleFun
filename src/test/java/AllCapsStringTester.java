import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//junit: open source unit testing framework
//unit under test: the unit)method, class, interface etc) that we are testing
//test class: normal java class it contains tests(methods w @Test annotations
//convention: slap "TEst" on the end of hte name of the class under test
public class AllCapsStringTester {

    /// use the @After and @Before annotations to set up a "test fixture"
    //test fixture: a fixed state of unit under test
    //used for each test method

    //key: no side effects between executions of tests

    //@Before setup() --> sets up the state of unit under test
    //@After tearDown() --> cleans up the state of unit under test
    @Before
    public void setup(){
        System.out.println("hello from setup");
    }
    //both executed for each test
    //setup and tear down of one and then setup tear down of the next etc
    //bookends
    @After
    public void tearDown(){
        System.out.println("hello from teardown");
        //release your resources
    }
    //test method: normal java method with @Test annotation to denote it is a test
    //convention: "test<unit name>" or "should<do something>"

    //how do we execute tests?
    //IDE or build tool/system
    //executes tests directly, no main
    //main() and run a "test suite" - notes on gdrive

    @Test
    public void testConstructor() {


        AllCapsString allCapsString = new AllCapsString("hello");
        assertEquals(allCapsString.getCapsStr(), "HELLO");
        // actual value, expected value
    }

    @Test
    public void testSetter(){
        AllCapsString allCapsString = new AllCapsString("hi");
        allCapsString.setCapsStr("bye");
        assertEquals(allCapsString.getCapsStr(), "BYE");
    }
}