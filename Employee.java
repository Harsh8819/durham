package ca.durhamcollege;

import java.nio.DoubleBuffer;
import java.time.LocalDate;

public abstract class Employee extends Person {
    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     * character or when fullName contains something other than letters, spaces,
     * hyphens, or apostrophes.
     */
    final String ID;

    public Employee(String fullName, LocalDate birthDate, String id) {
        super(fullName, birthDate);
        if (id.length() < 8) {
            throw new IllegalArgumentException("Id is less than 8 numbers");
        }
        ID = id;
    }

    public String getEmployeeId() {
        return this.ID;
    }

    abstract Double calculatePayDay();
}
