package org.vandyapps.productivityapp.network;

import android.content.Context;
import org.vandyapps.productivityapp.container.Msg;
import org.vandyapps.productivityapp.container.Project;
import org.vandyapps.productivityapp.container.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Represent a server that stores data and mediates communication
 * between devices and users.
 * 
 * This class will handle caching and saving data,
 */
public abstract class Server {
	
	/**
	 * Factory method.
	 */
	public static Server initiate(Context ctx) { return null; }
	
	public abstract Server terminate();
	
	public abstract User getUserById(int id);
	
	public abstract Project getProjectById(int id);
	
	public abstract List<Project> queryProjectsOf(User user);
	
	public abstract Server sendMessage(Msg message);

	// ----- Callback facility ----- //
	
	private List<ServerListener> mListeners = new ArrayList<ServerListener>();
	
	public interface ServerListener {
		void receiveServerCallback(int event, Object data);
	}
	
	public Server addServerListener(ServerListener listener) { 
		mListeners.add(listener);
		return this; }
	
	public Server removeServerListener(ServerListener listener) { 
		mListeners.remove(listener);
		return this; }
	
	protected void notifyListeners(int event, Object data) {
		for (ServerListener listeners : mListeners) {
			listeners.receiveServerCallback(event, data);
		}
	}
	
	// ----- END ----- //

    /**
     * All objects dished out by this server should have a way to talk back to server,
     * in order to record their state change.
     */
    public interface ServerSpawnling {
        void recognizeMeIBroughtYouIntoThisWorldToAdvanceMyCause(Server broodMother);
    }

}

