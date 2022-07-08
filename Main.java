class Main {

    public static double salaryCalculator(double hoursPerWeek, double amountPerHour) {
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        return weeklyPaycheck * 52;
    }

    public static void main(String[] args) {
        double salary = salaryCalculator(40, 36);
        System.out.println(salary);
    }
}
