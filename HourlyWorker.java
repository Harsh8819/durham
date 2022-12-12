package ca.durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee {
    Double hourlyRate;
    Double hoursPerWeek;

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        if (hourlyRate < 17)
            throw new IllegalArgumentException("Hourly rate can not be less than 17");
        this.hourlyRate = hourlyRate;
    }

    public Double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(Double hoursPerWeek) {
        if (hoursPerWeek > 48)
            throw new IllegalArgumentException("Exceed Hourly limit per week.");
        this.hoursPerWeek = hoursPerWeek;
    }

    public HourlyWorker(String fullName, LocalDate birthDate, String id, double rate, double hours) {
        super(fullName, birthDate, id);
        this.setHourlyRate(rate);
        this.setHoursPerWeek(hours);
    }

    @Override
    Double calculatePayDay() {
        return (double) Math.round(this.getHourlyRate() * this.getHoursPerWeek() * 100d) / 100d;
    }
}
