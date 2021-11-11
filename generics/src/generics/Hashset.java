package generics;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee>h=new HashSet<>();
		h.add(new Employee(123,"sowji",5000,"develop"));
		h.add(new Employee(678,"kusu",7000,"testing"));
		h.add(new Employee(456,"pradeep",8000,"develop"));
		h.add(new Employee(324,"venu",9000,"database"));
		h.add(new Employee(890,"ram",6000,"analyst"));
		Hashset.printHashSet(h);
	}
	private static void printHashSet(HashSet<Employee> h) {
		for(Employee temp:h) {
			System.out.println(temp);
		}
	}

}
