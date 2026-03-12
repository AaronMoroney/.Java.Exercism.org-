public class SalaryCalculator {
    final static int MAX_SALARY = 2000;
    
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) 
            ? 0.85 
            : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20 ) 
            ? 13 
            : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return this.bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double netSalary = (1000 * this.salaryMultiplier(daysSkipped)) + this.bonusForProductsSold(productsSold);
        return (netSalary < 2000) 
            ? netSalary 
            : (double) MAX_SALARY; 
    }
}
