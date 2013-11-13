package org.vandyapps.productivityapp.container;

import java.util.ArrayList;
import java.util.Date;

public class Task {
	//not private because i want project-specific methods to access these things too
	
	protected int id;
	private String name;
	private String description;
	
	protected Project parent;
	
	protected ArrayList<User> userlist = new ArrayList<User>();

	protected Date startdate;
	protected Date enddate;

	private boolean checkmark;
	

	public Task() {
		name = "New Task";
		description = "No description available";
		startdate = new Date();
		enddate = new Date();
		checkmark = false;
	}
	
	public Task(String title, String desc, Date start, Date end)	{
		name = title;
		description = desc;
		startdate = start;
		enddate = end;
		checkmark = false;
	}

	
	
	public int getId(){
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	
	public String getDescription()	{
		return description;
	}
	
	public void setDescription(String newDesc){
		description = newDesc;
	}
	
	
	public Date getStartDate(){
		return startdate;
	}
	
	public void setStartDate(Date newStart){
		startdate = newStart;
	}
	
	public Date getEndDate(){
		return enddate;
	}
	
	public void setEndDate(Date newEnd){
		enddate = newEnd;
	}
	
	
	
	public Project getProject(){
		return parent;
	}
	
	
	public void addUser(User newUser){
		userlist.add(newUser);
	}
	
	public void deleteUser(User user){
		int i = 0;
		while(i < userlist.size() && user.getId() != userlist.get(i).getId())
		{
			i++;
		}
		if(i != userlist.size())
		{
			userlist.remove(i);
		}	
	}
	
	public String getUsers(){ //deals with getting the list of users, not sure if using id #s or usernames still
		String list = "";
		for(int i = 0; i < userlist.size(); i++){
			list += userlist.get(i).getUsername() + "\n";
		}
		return list;
	}
	
	
	
	
	public void taskCompleted(){
		checkmark = true;
	}
	
	public void taskUnfinished(){
		checkmark = false;
	}
	
	public boolean ifComplete(){
		return checkmark;
	}
	
		
}