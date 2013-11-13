package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ProjectTest {
Project pro;
Team team;
Task task;
Story story;
Sprint sprint1;
ArrayList<Task> Tasks = new ArrayList<Task>() ;
	@Before
	public void setUp() throws Exception {
		pro=new Project();
		team=new Team();
		story=new Story();
		task=new Task();
		sprint1=new Sprint();
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
	
	@Test
	public void test3() {
		
		
			
		story.AddStory("As a Studnet i want to login",7,10);
		assertEquals("As a Studnet i want to login", story.getStoryTitle());
		
	}
	@Test
	public void test4() {
		
		
		task.addTasks("Coding",2);
		Tasks.add(task);
		task.addTasks("Testing",5);
		Tasks.add(task);
		
		assertTrue(Tasks.containsAll(Tasks));
		
	}
	@Test
	public void test5() {
		
		
		sprint1.setStoryDetails(story);
		assertTrue(sprint1.getStoryDetails().equals(story));
		
		
	}
	@Test
	public void test6() {
		
		team.allocateTasks(team.Rolelist.get(1),Tasks.get(0).TaskName);
		team.allocateTasks(team.Rolelist.get(0),Tasks.get(0).TaskName);
		team.allocateTasks(team.Rolelist.get(2),Tasks.get(0).TaskName);
		
		//assertEquals("Member",team.MemberTask);
		
		
		
		
	}
}
	

