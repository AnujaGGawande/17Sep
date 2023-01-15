package SS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLIstProg {

	public static void main(String[] args) {
   ArrayList A1 = new ArrayList();
   ArrayList A2 = new ArrayList(1000);
   ArrayList A3 = new ArrayList(A2);	
   
   System.out.println("Is A1 is empty=" + A1.isEmpty());
   System.out.println("Size="+A1.size());
   
   A1.add(10);
   A1.add("Harry");
   A1.add("Ron");
   A1.add(12222.22);
   A1.add('A');
   A1.add(null);
   
   System.out.println("Elements in A1="+A1);
   System.out.println("Is A1 is empty=" + A1.isEmpty());
   System.out.println("Size="+A1.size());
   
   for(int i=0;i<=5;i++)
   {
	   A1.add(i);
	   System.out.println("Elements in A1="+A1);
   }
   A1.add(3,"Albus");
   System.out.println("Elements in A1="+A1);
   
   System.out.println("Is A1 contain A="+A1.contains('A'));
   System.out.println("Value at index 9="+A1.get(9));
   System.out.println("Index of A="+A1.indexOf('A'));
   System.out.println("First index of 10="+ A1.indexOf(10));
   System.out.println("Last index of 10="+A1.lastIndexOf(10));
   
   A1.remove(6);
   System.out.println("Elements in A1="+A1);
   A1.set(1,"Harry Potter");
   System.out.println("Elements of A1="+A1);
   
   for(int i=0;i<A1.size();i++)
   {
	   System.out.println("A1.get++");
   }
   System.out.println("-----------------------------");
   for(int i=A1.size()-1;i>=0;i--)
   {
	 System.out.println("A1.get(i)");  
   }
   System.out.println("-----------------------------------");
   System.out.println("Elements in A1 ="+A1);
   Collections.sort(A2);
   System.out.println("Elements in A2="+A2);
   
	}

}
