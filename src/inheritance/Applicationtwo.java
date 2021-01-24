package inheritance;

public class Applicationtwo {
	public static void main(String[] args) {
		// interface
		Parents obj = ObjectHelper.getChildren();
		System.out.println("Name :"+obj.name());
		System.out.println("Car :"+obj.car());
		System.out.println("Property :"+obj.property());
		System.out.println("Villa :"+obj.villa());
		System.out.println();
		
		Parents object = new Chindrentwo();
		System.out.println("Name :"+object.name());
		System.out.println("Car :"+object.car());
		System.out.println("Property :"+object.property());
		System.out.println("Villa :"+object.villa());
		System.out.println();
		
		// abstract class
		Family familyobj = ObjectHelper.getChildrenthree();
		System.out.println("Name :"+familyobj.name());
		System.out.println("Car :"+familyobj.car());
		System.out.println("Property :"+familyobj.property());
		System.out.println("Villa :"+familyobj.villa());
		System.out.println();
		
		Family familyobject = new Childrenfour();
		System.out.println("Name :"+familyobject.name());
		System.out.println("Car :"+familyobject.car());
		System.out.println("Property :"+familyobject.property());
		System.out.println("Villa :"+familyobject.villa());
		System.out.println();
	}

}
