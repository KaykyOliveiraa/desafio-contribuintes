package Program;

public class TaxPayer {
	
	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpeding;
	
	public TaxPayer() {
	}

	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
			double educationSpeding) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpeding = educationSpeding;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpeding() {
		return educationSpeding;
	}

	public void setEducationSpeding(double educationSpeding) {
		this.educationSpeding = educationSpeding;
	}
	
	public double salaryTax() {
		if(salaryIncome / 12 >= 3000 && salaryIncome / 12 <= 5000) {
			return salaryIncome * 0.1;
		}else if(salaryIncome / 12 > 5000){
			return salaryIncome * 0.2;
		}
		return 0;	
	}
	
	public double serviceTax() {
		if (serviceIncome != 0) {
			return serviceIncome * 0.15;
		}
		return 0;
	}

	public double capitalTax() {
		if (capitalIncome != 0) {
			return capitalIncome * 0.2;
		}
		return 0;
	}
	
	public double grossTax() {
		return capitalTax() + serviceTax() + salaryTax();
	}
	
	public double taxRebate() {
		 double maximoDedutivel = grossTax() * 0.3;
		 double gastosDedutiveis = healthSpending + educationSpeding;
	
		 return Math.min(maximoDedutivel, gastosDedutiveis);
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
}
