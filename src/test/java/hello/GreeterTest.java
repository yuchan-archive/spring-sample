/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

/**
 *
 * @author yusuke.a.ohashi
 */
public class GreeterTest {
    private Greeter greeter;
    
    public GreeterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        greeter = new Greeter();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("hello"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
    // public void hello() {}
}
