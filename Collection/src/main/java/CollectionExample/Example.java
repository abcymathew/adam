package CollectionExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example {
	public static void main(String args[])
	{
	ArrayList<String> m=new ArrayList<String>();
	m.add("orange");
	m.add("apple");
	m.add("avacado");
	m.add("grapes");
	m.add("mango");
	System.out.println("list"+" "+m);
	m.remove("mango");
	m.remove(2);
	
	System.out.println("list"+" "+m);
	Collections.sort(m);
	System.out.println("list"+" "+m);
	System.out.println("retrieve each element using simple for loop");
	for(int i=0;i<m.size();i++)
	{
		System.out.println(m.get(i));
	}
	System.out.println("to retrieve element using foreach loop");
	for(String element:m)
	{
		System.out.println(element);
	}
	System.out.println("retireve elemnts using iterator");
	Iterator<String> lt=m.iterator();
	while(lt.hasNext())
	{
		System.out.println(lt.next());
	}
	
	
System.out.println("using get method"+" "+m.get(2));
m.set(1,"guava");
Iterator<String> lte=m.iterator();
while(lte.hasNext())
{
	System.out.println(lte.next());
}

}
}


	


