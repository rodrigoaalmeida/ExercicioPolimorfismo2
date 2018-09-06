package entities;

public class Individual extends TaxPayer {

	private Double HealthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double income, Double healthExpenditures) {
		super(name, income);
		HealthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return HealthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		HealthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		if(getIncome() < 20000.00) {
			sum = (getIncome() * 0.15) - (HealthExpenditures * 0.5);
		}else {
			sum = (getIncome() * 0.25) - (HealthExpenditures * 0.5);
		}
		return sum;
	}

}
