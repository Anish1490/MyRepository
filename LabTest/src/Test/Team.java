package Test;

import java.util.ArrayList;




public class Team {

	public int velocity;
	
	public int teamSize;
	ArrayList<String> Rolelist = new ArrayList<String>() ;
	
	public void CreateTeam(int i, ArrayList<String> roles) {
		// TODO Auto-generated method stub
		
		if(i > 3 || i < 7){
		Rolelist=roles;
		}
		
	}

	public int getTamSize() {
		// TODO Auto-generated method stub
		return Rolelist.size();
	}
	
	
	
}
