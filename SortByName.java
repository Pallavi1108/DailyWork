package cog.cognizant;
import java.util.Comparator;
public class SortByName implements Comparator<Employeee> {

	@Override
	public int compare(Employeee emp1, Employeee emp2) {
	
	return emp1.getName().compareTo(emp2.getName());
	}

}
