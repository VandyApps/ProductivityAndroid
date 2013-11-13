package org.vandyapps.productivityapp.container;

import java.util.ArrayList;

public class Project {

	/**
	 * @param args
	 */
	//the designated project to be worked on
	//will contain methods that create the hierarchy of Tasks to be completed
	
	protected ArrayList<Task> tasks = new ArrayList<Task>();
	private String name;
	private String description;
	
	
	public Project(){
		name = "New Project";
		description = "No description available";
	}
	
	public Project(String newName, String newDesc){
		name = newName;
		description = newDesc;
	}
	
	
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setDescription(String newDesc){
		description = newDesc;
	}
	
	public String getDesc(){
		return description;
	}
	
	
	
	public void addTask(Task newTask){
		tasks.add(newTask);
	}
	
	public void deleteTask(Task removeTask){
		int i = 0;
		while(i < tasks.size() && tasks.get(i).getId() != removeTask.getId())
		{
			i++;
		}
		if(i != tasks.size())
		{
			tasks.remove(i);
		}
	}
	
	public String getTasks(){
		String list = "";
		for(int i = 0; i < tasks.size(); i++)
		{
			list += tasks.get(i).getName() + "\n";
		}
		return list;
	}
	
}
