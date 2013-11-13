package Test;

public class Story {

	public String StoryTitle;
	public int StoryPriority;
	public int StoryPoint;
	
	public Task TaskDetails;

	public void AddStory(String title, int priority, int points) {
		// TODO Auto-generated method stub
		this.StoryTitle=title;
		this.StoryPriority=priority;
		this.StoryPoint=points;
		
	}

	public String getStoryTitle() {
		return StoryTitle;
	}

	public void setStoryTitle(String storyTitle) {
		StoryTitle = storyTitle;
	}

	public int getStoryPriority() {
		return StoryPriority;
	}

	public void setStoryPriority(int storyPriority) {
		StoryPriority = storyPriority;
	}

	public int getStoryPoint() {
		return StoryPoint;
	}

	public void setStoryPoint(int storyPoint) {
		StoryPoint = storyPoint;
	}
	
	
	
	
	
}
