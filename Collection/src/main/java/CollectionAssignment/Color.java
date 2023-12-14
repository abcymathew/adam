package CollectionAssignment;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Color {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("green");
		a.add("blue");
		a.add("white");
		a.add("orange");
		System.out.println(a);
		System.out.println("element at 2nd position"+a.get(2));
		Iterator<String> lte=a.iterator();
		while(lte.hasNext())
		{
			System.out.println(lte.next());
		}
		a.remove(3);
		System.out.println(a);
		boolean ans=a.contains("blue");
		System.out.println(ans);
		

	}

}
