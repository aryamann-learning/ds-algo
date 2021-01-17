package com.inheritance;

public class Application {
	public static void main(String[] args) {
		Parent parentobj = new Parent();
		// parent
		System.out.println("parent name:" + parentobj.getname());
		System.out.println("surname :" + parentobj.getSurname());
		System.out.println("Car:" + parentobj.getcar());
		System.out.println("Blood group:" + parentobj.getBloodgroup());
		System.out.println("House:" + parentobj.gethome());
		System.out.println();

		// child1
		Child1 childoneobj = new Child1();
		System.out.println("child one name:" + childoneobj.getname());
		System.out.println("surname :" + childoneobj.getSurname());
		System.out.println("Car:" + childoneobj.getcar());
		System.out.println("Blood group:" + childoneobj.getBloodgroup());
		System.out.println("House:" + childoneobj.gethome());
		System.out.println();

		// child2
		Child2 childtwoobj = new Child2();
		System.out.println("child two name:" + childtwoobj.getname());
		System.out.println("surname :" + childtwoobj.getSurname());
		System.out.println("Car:" + childtwoobj.getcar());
		System.out.println("Blood group:" + childtwoobj.getBloodgroup());
		System.out.println("House:" + childtwoobj.gethome());
		System.out.println();

		// child3
		Child3 childthreeobj = new Child3();
		System.out.println("child three name:" + childthreeobj.getname());
		System.out.println("surname :" + childthreeobj.getSurname());
		System.out.println("Car:" + childthreeobj.getcar());
		System.out.println("Blood group:" + childthreeobj.getBloodgroup());
		System.out.println("House:" + childthreeobj.gethome());
		System.out.println();
	}

}
