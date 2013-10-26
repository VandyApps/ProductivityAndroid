import org.vandyapps.productivityapp.Project;
import org.vandyapps.productivityapp.User;

/**
 * Represent a server that stores data and mediates communication
 * between devices and users.
 * 
 * This class will handle caching and saving data,
 */
public class abstract Server {
	
	/**
	 * Factory method.
	 */
	public static Server initiate(Context ctx) { return null; }
	
	public abstract Server terminate() { return null; }
	
	public abstract User getUserById(int id) { return null; }
	
	public abstract Project getProjectById(int id) { return null; }
	
	public abstract List<Project> queryProjectsOf(User user) { return null; }
	
	
	// ----- Messaging facility ----- //
	
	private List<ServerListener> mListeners = new ArrayList<ServerListener>();
	
	public interface ServerListener {
		void receiveServerCallback(int event, Object data);
	}
	
	public Server addServerListener(ServerListener listener) { 
		mListeners.add(listener);
		return this; )
	
	public Server removeServerListener(ServerListener listener) { 
		mListeners.remove(listener);
		return this; }
	
	protected void notifyListeners(int event, Object data) {
		for (ServerListener listeners : mListeners) {
			listeners.receiveServerCallback(event, data);
		}
	}
	
	// ----- END ----- //
}

