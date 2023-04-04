package lect3;

public class main {
	public static void main(String[] args) {
	Arraylist l = new Arraylist();
	int s= l.getsize();
    System.out.println(s);
    
    l.add(0,"Hanin");
    l.add(1,"Sara");
    l.add(1,"Lamar");
    l.add(1,"Walaa");
    l.add(1,"mehreen");
    l.add(1,"hamza");
    l.add(1,"zoha");  
    l.add(1,"maliha");
    l.add(1,"junaid");
    l.add(1,"jawad");
    l.add(1,"sameera");
    l.add(1,"ibrahim");
    l.add(1,"umar");

    System.out.println(l.getsize());
    
    for (int i=0; i<l.getsize();i++)
    {
        System.out.print(l.get(i)+" ");
        
    }
    System.out.println("\n\n");
    int size=l.getsize();
    for (int j=size-1; j>=0 ;j--)
    {
        System.out.print(l.get(j)+" ");
        l.remove(l.getsize()-1);
    }
    
}}

