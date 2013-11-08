package org.vandyapps.productivityapp.container;

import org.vandyapps.productivityapp.network.Network;

import java.util.ArrayList;

public class User {
	private int id;//hash value, probably; not so sure about this
	private String name = "";

	private ArrayList<Network> myNetworks = new ArrayList<Network>();
	private ArrayList<Project> myProjects = new ArrayList<Project>();
	private ArrayList<Task> myTasks = new ArrayList<Task>();

	private ArrayList<Msg> myMsgs = new ArrayList<Msg>();

	public User() {
		//use randomly generated username, maybe like "AnonymousXXX"
		//use randomly generated id number
		
	}
	public User(String username, int identificationhash) { 
		name = username;
		id = identificationhash;
	}//construct with username and hashed ID

	public boolean senduserMsg(Msg msgtosend) {return true; } //send message to other user (touser contained in Msg struct)
	public boolean receiveuserMsg(Msg msgtosend) {return true;} //boolean returned: 0 for didn't work, 1 for did work
	public boolean sendtaskMsg(Msg msgtosend) {return true; } //could also return int if want to use -1, 0, 1 instead
	public boolean receivetaskMsg(Msg msgtosend) {return true; } 
	public boolean get(String field) {return true;} 
	public boolean complete(Task finishedtask) {return true;}  //check off a task; mark it complete
	
	public boolean addNetwork(Network possiblenetwork) {
		if(myNetworks.add(possiblenetwork)){
			return true;
		}
		return false;
	}  //or integer ID if we're doing that
	public boolean addProject(Project newProject) {
		if(myProjects.add(newProject)){
			return true;
		}
		return false;
	}
	public boolean addTask(Task newTask) {
		if(myTasks.add(newTask)){
			return true;
		}
		return false;
	}
	public boolean receivenotif(Notification notiftoreceive) {
		
		return true;
	} 

}
