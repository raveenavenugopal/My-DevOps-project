package devops.numbers;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests 
extends TestCase
{
	private NumberWords numberWords ;
	
	public NumberWordsTests( String testName )
    {
        super( testName );
    }
	
	public static Test suite()
    {
        return new TestSuite( NumberWordsTests.class );
    }
	
	 public void testApp()
    {
        assertTrue( true );
    }
}
