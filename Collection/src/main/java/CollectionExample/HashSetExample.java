package CollectionExample;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashSet<String> s=new HashSet<String>();
	s.add("bmw");
	s.add("benz");
	s.add("honda");
	Iterator<String> l=s.iterator();
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	s.remove("bmw");
	System.out.println(s);
	System.out.println(s.size());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	