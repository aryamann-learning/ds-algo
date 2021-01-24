package inheritance;

public interface Parents {
public String name();
public String car();
public String property();
default String villa(){
	return "rosewood villa";
}
}


