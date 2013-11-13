package Test;

import java.util.ArrayList;

public class Task {
	
	public Task task;
	ArrayList<String> MemberTask = new ArrayList<String>() ;
	
	public int NeededHours;
	
	public String TaskName;
	
	public int getNeededHours() {
		return NeededHours;
	}
	public void setNeededHours(int neededHours) {
		NeededHours = neededHours;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public void addTasks(String Name, int Hours) {
		// TODO Auto-generated method stub
		this.NeededHours=Hours;
		this.TaskName=Name;
	}
	
	public Task TaskDetails()
	{
	return task;	
		
	}
	
}
