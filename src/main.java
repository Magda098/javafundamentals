public class main {
    public static void calculateEmployeeGrossSalary(double hoursPerDay,double vacationDays,double earningsPerHour) {

       // double employeeTotalWeeklySalary=hoursPerWeek*earningsPerHour;
        double vacationHours=hoursPerDay*vacationDays;
        double hoursPeryear=hoursPerDay*365;
        double paidHours=hoursPeryear-vacationHours;
        double grossYearlySalary=paidHours*earningsPerHour;

        System.out.println("Gross Salary is:"+ grossYearlySalary);
    }
    public static void main(String[] args) {

        calculateEmployeeGrossSalary(8, 24,500);


    }
}