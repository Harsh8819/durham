package ca.durhamcollege;

import java.nio.DoubleBuffer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double yearlySalary;

    public SalariedEmployee(String fullName, LocalDate birthDate, String id, double salary) {
        super(fullName, birthDate, id);
        this.setYearlySalary(salary);
    }

    public Double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(Double yearlySalary) {
        if (yearlySalary > 0) this.yearlySalary = yearlySalary;
        else throw new IllegalArgumentException("Negative salary is not allowed.");
    }

    @Override
    Double calculatePayDay() {
        double weeklyPay = this.getYearlySalary() / 52;
        return (double) Math.round(weeklyPay * 100d) / 100d;
    }
}
