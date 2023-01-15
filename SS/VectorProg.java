package SS;

import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
    Vector V1= new Vector();              //defalult 10
    Vector V2= new Vector(500);
    Vector V3= new Vector(20,11);
    Vector V4= new Vector(V1);
    
    System.out.println(V3);
    System.out.println("Capacity of V1="+V1.capacity());
    System.out.println("Capacity of V2="+V2.capacity());
    System.out.println("Capacity of V3="+V3.capacity());
    System.out.println("Capacity of V4="+V4.capacity());
    for(int i=0;i<20;i++)
       V3.add(i);
    System.out.println("Capacity of V3="+V3.capacity());
    V3.add("ABC");
    System.out.println("Capacity of V3 after growing = " + V3.capacity());
    
    V1.add("Ron");
    V1.add("100");
    V1.add("1.222");
    V1.add('C');
    V1.addElement(1000);
    System.out.println(V1);
    V1.remove(0);
    V1.removeElement(1);
    V1.set(0,100000);
    V1.setElementAt(11,1);
    V1.add("Ron");
    V1.add(100);
    V1.add(1.222);
    V1.addElement(1000);
    System.out.println(V1);
    System.out.println("---------------------");
    for(Object v : V1)
    System.out.println(v);
	}

}
