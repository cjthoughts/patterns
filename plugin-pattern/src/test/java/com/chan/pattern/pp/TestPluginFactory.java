package com.chan.pattern.pp;



import com.chan.pattern.pp.parser.IParser;
import com.chan.pattern.pp.plugin.PluginFactory;
import junit.framework.TestCase;

/**
 * @author bbailey
 *
 */
public class TestPluginFactory extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testGetPlugin() {
		IParser iFile = PluginFactory.getPlugin("xml");
		System.out.println("----->"+iFile.getName());
		
		//fail("Not yet implemented");
	}

}
