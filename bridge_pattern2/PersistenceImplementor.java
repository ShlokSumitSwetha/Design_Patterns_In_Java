package Complete_Design_Patterns.bridge_pattern2;

/**
 * Implementor Interface 
 */
public interface PersistenceImplementor {

	public long saveObject(Object object);
	
	public void deleteObject(long objectId);
	
	public Object getObject(long objectId);
	
	
}
