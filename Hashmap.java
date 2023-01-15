import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
       HashMap a=new HashMap();
       a.put(1,"Anuja");
       a.put(2,"Ashwini");
       a.put(3, "Akshay");
        System.out.println(a);
        
		a.put(null, "Meta");
		a.put(null, "Porsh");
		System.out.println(a);
		
		a.put(4,"Hii");
		a.put(5,"Hii");
		System.out.println(a);
		
		System.out.println(a.keySet());
		System.out.println(a.values());
		System.out.println(a.entrySet());
		System.out.println("-------------------------");
		
		Set b =a.entrySet();
		Iterator c=b.iterator();
		for(;c.hasNext(););
		{
			System.out.println(c.next());
		}
		
	}

}
