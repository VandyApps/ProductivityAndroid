package org.vandyapps.productivityapp;

import java.util.Date;

public class Task {
	//not private because i want project-specific methods to access these things too
	protected boolean tasktype; //initialized to 0 for standard task, 1 for project; could use int if we want multiple derived classes

	protected User[] assignedusers; //array of pointers; may instead be an int* if using user IDs
	protected int numberofassignedusers;
	protected User[] followingusers;//users following updates to this task
	protected int numberoffollowingusers;

	protected Date startdate;
	protected Date enddate;

	protected String[] tags;

	protected Task[] supertasks;

	protected Task[] subtasks;
	
	

	//protected Milestone[] milestonelist;

		//whatever other fields we choose to add
		//have a dynamic array of "field" objects
		//with title and description for base class
		//and then inherited classes for special fields
		//such as budget, date, bill of materials, etc

	public Task()	{	}
	public Task(Task superclass)	{	}
		//possibly other ctors 

	public boolean get(String field) {return true;}
	public boolean set(String field, Itemtype newval) {return true;}
	public boolean adduser(User usertoadd )	{return true;}
	public boolean sendmsg(Msg msgtosend )	{return true;}
	public boolean receivemsg(Msg msgtosend )	{return true;}
	public boolean sendnotif(User usertosend, Notification notiftosend)	{return true;}
		
}