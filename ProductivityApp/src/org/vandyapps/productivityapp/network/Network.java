package org.vandyapps.productivityapp.network;

public class Network {
	private int id;
	private ArrayList<String> user;
	private ArrayList<String> project;
	private String name;
	private String description;
	
	
	/**
	 * Create a network with a given name and assigned network id.
	 * @param id
	 * @param name
	 */
	public Network(int id, String name) {
		if (name.equals("")) {
			setName("Unnamed Network");
		}
		else{
			setName(name);
		}
		
		if (id<0) {
			throw new IllegalArgumentException();
		}
		this.id=id;
	}
	

	/**
	 * Set network name to given value.
	 * @param name
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * Set network description to a given value.
	 * @param description
	 */
	/* I didn't think that a network description was an essential
	 * aspect of creating a network.  However, we can add in the
	 * functionality to set the description when adding a network
	 * either here or in the GUI (??) later.
	 */
	public void setDescription(String description) {
		this.description=description;
	}
	
	/**
	 * Returns network name.
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns network description.
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * Returns network id.
	 * @return
	 */
	/* I'm not sure if there would ever be a reason to retrieve an id.
	 * If we want to keep it private, that's easy; we'll just delete
	 * this method.
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Add user to array list of users in the network. 
	 * @param name
	 * @return--returns true if adding user generates no exceptions,
	 * false if exception generated
	 */
	/* Do we want users to be identified by an id instead?
	 * That way we could attach other important information
	 * to them as well--ex. email, work, picture, etc.
	 * This would preclude people with the same name being
	 * interpreted as the same user.
	 */
	public boolean addUser(int userid) {
		/*try {
			user.add(userid);
			return true;
		}
		finally {
			return false;
		}*/
		if (user.add("userid")){
			// here we have to add whatever String is associated with
			// a given user id
			return true;
		}
		return false;
		/* This 'finally' is jank and incorrect coding, I'm pretty
		 * sure, but I don't know what kind of exception we'd
		 * be throwing when trying to add users.  The finally in
		 * this case would execute if any type of exception occurs.
		 * We could easily change this later.
		 */
		// Network will check to see if user has administrator 
	}
	
	/**
	 * Adds project to array list of projects in the network.
	 * @param project
	 * @return--returns true if no exceptions generated, false if
	 * exception generated
	 */
	/* See previous comments about try-finally. Same with a project
	 * id.
	 */
	public boolean addProject(int projectid) {
		/*try {
			this.project.add(projectid);
			return true;
		}
		finally {
			return false;
		}*/
		if(this.project.add("projectid")){
			// here we have to add whatever String is associated with
			// a given project id
			return true;
		}
		return false;
		// return project id instead?
	}
	
	/**
	 * Removes a user from the network.
	 * @return--returns true if no exceptions generated, false if
	 * exception generated
	 */
	/* Instead of a boolean, we might want to change this to return an
	 * int depending on various error messages, i.e. 1 for if user does
	 * not have permission to remove another user, 2 if the user does
	 * not exist, etc.
	 * Another way to preclude the "user does not exist" error would be
	 * to associate users with an id number. 
	 */
	public boolean removeUser(int userid) {
		try {
			this.user.remove(this.user.indexOf(userid));
			// we have problems here if multiple users have the same name
			return true;
		}
		finally {
			return false;
		}		
	}
	
	/**
	 * Removes 
	 * @param project
	 * @return--returns true if no exceptions generated, false if
	 * exception generated
	 */
	
	/* See comments on 'removeUser.'
	 */
	public boolean removeProject(int projectid) {
		try {
			this.project.remove(this.project.indexOf(projectid));
			// problems if multiple projects have the same name
			return true;
		}
		finally {
			return false;
		}
	}
}
