package Test;

import java.util.ArrayList;




public class Team {

	public int velocity;
	public Task task;
	public String MemberTask;
	public String TaskName;
	public int teamSize;
	ArrayList<String> Rolelist = new ArrayList<String>() ;
	
	public void CreateTeam(int i, ArrayList<String> roles) {
		// TODO Auto-generated method stub
		
		if(i > 3 || i < 7){
		Rolelist=roles;
		}
		
	}

	
	public void allocateTasks(String member, String tasks) {
		// TODO Auto-generated method stub
		this.MemberTask= member;
		this.TaskName=tasks;
		
	}
	
	public int getVelocity() {
		return velocity;
	}


	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}


	public Task getTask() {
		return task;
	}


	public void setTask(Task task) {
		this.task = task;
	}


	public String getMemberTask() {
		return MemberTask;
	}


	public void setMemberTask(String memberTask) {
		MemberTask = memberTask;
	}


	public String getTaskName() {
		return TaskName;
	}


	public void setTaskName(String taskName) {
		TaskName = taskName;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public ArrayList<String> getRolelist() {
		return Rolelist;
	}


	public void setRolelist(ArrayList<String> rolelist) {
		Rolelist = rolelist;
	}


	public int getTamSize() {
		// TODO Auto-generated method stub
		return Rolelist.size();
	}
	
	
	
}
