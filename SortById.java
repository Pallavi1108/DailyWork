package cog.cognizant;

import java.util.Comparator;

public class SortById implements Comparator<Employeee>
{

	@Override
	public int compare(Employeee emp1, Employeee emp2) {
		// TODO Auto-generated method st
			if(emp1.getId() > emp2.getId())
			{
				return 1;
			}
				else if(emp1.getId() == emp2.getId()) {
					return 0;
				}
			
			else {
				return -1;
			}

	}
	
	
	}

