package inheritance;

public class Applicationone {
	public static void main(String[] args) {
		Parent parentobj = new Parent();
		// parent
		System.out.println("parent name:" + parentobj.getname());
		System.out.println("surname :" + parentobj.getSurname());
		System.out.println("Property :" + parentobj.getProperty1());
		System.out.println("Property :" + parentobj.getProperty2());
		System.out.println("Car:" + parentobj.getcar());
		System.out.println("Blood group:" + parentobj.getBloodgroup());
		System.out.println("House:" + parentobj.gethome());
		System.out.println();

		// child1
		Childone childoneobj = new Childone();
		System.out.println("child one name:" + childoneobj.getname());
		System.out.println("surname :" + childoneobj.getSurname());
		System.out.println("Property :" + childoneobj.getProperty1());
		System.out.println("Property :" + childoneobj.getProperty2());
		System.out.println("Car:" + childoneobj.getcar());
		System.out.println("Blood group:" + childoneobj.getBloodgroup());
		System.out.println("House:" + childoneobj.gethome());
		System.out.println();

		
	}

}
