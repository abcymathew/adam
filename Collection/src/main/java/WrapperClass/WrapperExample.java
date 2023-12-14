package WrapperClass;
import java.util.Collections;
import java.util.ArrayList;

public class WrapperExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();//generic collection
		l.add(20);
		l.add(40);
		l.add(50);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		ArrayList<Character> c=new ArrayList<Character>();
		c.add('m');
		c.add('n');
		System.out.println(c);
		System.out.println(c.get(1));
		ArrayList<Float> v=new ArrayList<Float>();
		v.add(1.7f);
		System.out.println(v);
		ArrayList s=new ArrayList();//non-generic collection
		s.add(1);
		s.add("hi");
		s.add('f');
		System.out.println(s);
		

	}

}
