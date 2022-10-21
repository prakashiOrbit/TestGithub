
public class Employee {
int E_id;
String E_name;
public Employee(int e_id, String e_name) {
	super();
	E_id = e_id;
	E_name = e_name;
}

@Override
public String toString() {
	return "Employee [E_id=" + E_id + ", E_name=" + E_name + "]";
}

public static void main(String [] args)
{
Employee employee=new Employee(1, "ding2");
Employee employee2=new Employee(2, "dinga");
System.out.println(employee);
System.out.println(employee2);
}
}
