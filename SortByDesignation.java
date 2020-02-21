package cog.cognizant;
import java.util.Comparator;
public class SortByDesignation implements Comparator<Employeee> {

	@Override
	public int compare(Employeee emp1, Employeee emp2) {
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}

}
