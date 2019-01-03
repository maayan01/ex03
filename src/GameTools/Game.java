package GameTools;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Game
{
	//------------------fields-----------------------------
	Set<Fruit> setFruits;
	Set<Packman> setPackmans;

	//------------------constructor------------------------
	public Game ()
	{
		setFruits = new HashSet<Fruit>();
		setPackmans = new HashSet<Packman>();
	}
	//------------------------------------------------------

	public static void Csv2Game ()
	{

	}

	//--------------set methods Fruit------------------------
	public boolean add_f(Fruit arg0) 
	{
		return setFruits.add(arg0);
	}
	public boolean addAll_f(Collection<? extends Fruit> arg0) 
	{
		return setFruits.addAll(arg0);
	}
	public void clear_f() 
	{
		setFruits.clear();
	}
	public boolean contains_f(Object arg0) 
	{
		return setFruits.contains(arg0);
	}
	public boolean containsAll_f(Collection<?> arg0) 
	{
		return setFruits.containsAll(arg0);
	}
	public boolean isEmpty_f() 
	{
		return setFruits.isEmpty();
	}
	public Iterator<Fruit> iterator_f() 
	{
		return setFruits.iterator();
	}
	public boolean remove_f(Object arg0) 
	{
		return setFruits.remove(arg0);
	}
	public boolean removeAll_f(Collection<?> arg0) 
	{
		return setFruits.removeAll(arg0);
	}
	public boolean retainAll_f(Collection<?> arg0) 
	{
		return setFruits.retainAll(arg0);
	}
	public int size_f() 
	{
		return setFruits.size();
	}
	public Object[] toArray_f()
	{
		return setFruits.toArray();
	}
	public <T> T[] toArray_f(T[] arg0) 
	{
		return setFruits.toArray(arg0);
	}

	//--------------set methods packman------------------------
	public boolean add_p(Packman arg0) 
	{
		return setPackmans.add(arg0);
	}
	public boolean addAll_p(Collection<? extends Packman> arg0) 
	{
		return setPackmans.addAll(arg0);
	}
	public void clear_p() 
	{
		setPackmans.clear();
	}
	public boolean contains_p(Object arg0) 
	{
		return setPackmans.contains(arg0);
	}
	public boolean containsAll_p(Collection<?> arg0) 
	{
		return setPackmans.containsAll(arg0);
	}
	public boolean isEmpty_p() 
	{
		return setPackmans.isEmpty();
	}
	public Iterator <Packman> iterator_p() 
	{
		return setPackmans.iterator();
	}
	public boolean remove_p(Object arg0) 
	{
		return setPackmans.remove(arg0);
	}
	public boolean removeAll_p(Collection<?> arg0) 
	{
		return setPackmans.removeAll(arg0);
	}
	public boolean retainAll_p(Collection<?> arg0) 
	{
		return setPackmans.retainAll(arg0);
	}
	public int size_p() 
	{
		return setPackmans.size();
	}
	public Object[] toArray_p()
	{
		return setPackmans.toArray();
	}
	public <T> T[] toArray_p(T[] arg0) 
	{
		return setPackmans.toArray(arg0);
	}

	//--------------------toString-----------------------
	public String toString ()
	{
		String res="" , setFruits , setPackmans;
		setFruits = this.setFruits.toString();
		setPackmans = this.setPackmans.toString();
		res = setFruits+" \n "+setPackmans;
		return res; 
	}
	
}
