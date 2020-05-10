public class main {
    public static double calculateEmployeeGrossSalary(double hoursPerWeek,double earningsPerHour,
                                                      int vacationDays) {
        /* if (hoursPerWeek < 0);{
            return -1;
        }
       if (earningsPerHour < 0);{
            return -1;
        }*/
        double weeklyPaycheck = hoursPerWeek*earningsPerHour;
        double unpaidTime=vacationDays*earningsPerHour*8;
        return (weeklyPaycheck*52)-unpaidTime;

    }

    public static void main(String[] args) {

        double grossSalary=calculateEmployeeGrossSalary(40,15,8);
        System.out.println(grossSalary);
    }
    
}