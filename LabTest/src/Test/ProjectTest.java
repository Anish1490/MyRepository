package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
Project pro;
	@Before
	public void setUp() throws Exception {
		pro=new Project();
	}

	@Test
	public void test() {
		pro.setProjectName("Calculator");
		assertEquals("Calculator", pro.getProjectName());
	}

	
	
	
	
	
}
