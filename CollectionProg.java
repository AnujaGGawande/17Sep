import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionProg  {
   
	public static void main(String[] args) {
		Vector v1 = new Vector();
		for(int i=0;i<=10;i++) 
			v1.add(i);
		System.out.println(v1);  
	
	       //CURSOR
	 
	 Enumeration e=v1.elements()	;
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		
	
		}                         
			
			//ITERATOR
		
		ListIterator b=v1.listIterator();
		while(b.hasNext())
		{
			int value1= (int) b.next();
			if(value1==3)
				b.remove();
			else if(value1==3)
				b.add(333);
			else if(value1==5)
				b.set(5555);
			System.out.println(b.next());
		}                             
		
		//ListIterator
//1.	
		System.out.println(v1);
		ListIterator c =v1.listIterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		System.out.println(c.previous());
	System.out.println("-------------------------------");
	while(c.hasPrevious());
	
//2.  
	ListIterator l =v1.listIterator();
	  while(l.hasNext())
	{
	  int a=(int)l.next();
	  if (a==5);
	     l.remove();
	   
	    if(a==9)
	     l.set(000);
	  
	   else if (a==3)
	      l.add(500);
	  
	 	  
	}
}
		
	}
