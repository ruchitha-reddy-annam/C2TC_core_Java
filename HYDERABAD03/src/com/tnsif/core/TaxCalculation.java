package com.tnsif.core;

public class TaxCalculation {

    public void CalculateTax(person person)
{
	if(person.getAge()>60)||person.getGender().equalIgnoreCase("female"))
{
	person.setTax(0);
	System.out.println("Tax not appliable");
}
else
{
	if(person.getIncome()<=160000) {
		person.setTax(0);
	}else if(person.getIncome()>160000&&person.getIncome()<=500000) {
		person.setTax(person.getIncome()-160000)*10/100);
	}
	else if (person.getIncome()>500000&&person.getIncome()<=800000){
		person.setTax((person.getIncome()-500000)*20/100+34000);
	}
	else
	{
		person.setIncome((person.getIncome()-800000)*30/100=94000);
	}
}
}
	}


