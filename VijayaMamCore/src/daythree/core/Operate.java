package daythree.core;

// Create Read Update Delete List

public interface Operate 
{
	public void update(Object obj);
	public Object read(int index);
	public void delete(int index);
	public void list();
}
