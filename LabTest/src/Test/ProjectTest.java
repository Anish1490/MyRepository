package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
Project pro;
Team team;
	@Before
	public void setUp() throws Exception {
		pro=new Project();
		team=new Team();
	}

	@Test
	public void test1() {
		pro.setProjectName("Calculator");
		assertEquals("Calculator", pro.getProjectName());
	}

	
	@Test
	public void test2() {
		
		ArrayList<String> Roles = new ArrayList<String>() ;
		
		Roles.add("Member");
		Roles.add("Product Owner");
		Roles.add("Scrum Master");
		Roles.add("Customer");
		
		team.CreateTeam(Roles.size(),Roles);
		//System.out.println(+Roles.size());
		assertEquals(4, team.getTamSize());
	}
	
	
	
}
