package com.MavenProject;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * @return 
     * @return the suite of tests being tested
     */
    @Test
    public void TestWelcomeMsg()
    {
    	App.welcomeMsg("Gopala Madhu Bindu");
        //        return new Test( AppTest.class );
    	//App myApp= new App();

    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Assert.assertTrue( true );
    }
}
