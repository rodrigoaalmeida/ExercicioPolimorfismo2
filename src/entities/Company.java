package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		if(numberOfEmployees > 10) {
			sum = getIncome() * 0.14;
		}else {
			sum = getIncome() * 0.16;
		}
		return sum;
	}

}
