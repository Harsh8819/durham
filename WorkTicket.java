/*
File_Name            :-  OOP2_LAB-2.java .
Students Name and ID :-  Harsh Patel(100849927)
						 Kanvi Patel(100842924).
Date                 :-  18 NOV 2022.
Course Name	         :-  Object Oriented Programming - 2.
Course Code 		 :-  OOP3200.

*/


import java.time.LocalDate;
public class WorkTicket {
    // Variables declaration
    private long workTicketNumber;
    private String clientID;
    private LocalDate workTicketDate;
    private String issueDescription;

    // Default constructor and providing default values for workTicketNumber and workTicketDate fields
    public WorkTicket() {
        this.workTicketNumber = 0;
        this.workTicketDate = LocalDate.of(2000, 1, 1);
    }

    // Parameterized constructor with validations for workTicketNumber and workTicketDate fields
    public WorkTicket(long workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        if(workTicketNumber > 0) {
            this.workTicketNumber = workTicketNumber;
        } else {
            throw new IllegalArgumentException("Work Ticket Number should be greater than 0 and it should not be a negative number");
        }
        this.clientID = clientID;
        if(workTicketDate.isBefore(LocalDate.of(2000, 1, 1)) || workTicketDate.isAfter(LocalDate.of(2099, 12, 31))) {
            throw new IllegalArgumentException("Work Ticket Date should not be before 1/1/2000 and should not be after 31/12/2099");
        } else {
            this.workTicketDate = workTicketDate;
        }
        this.issueDescription = issueDescription;
    }

    // getter method for WorkTicketNumber
    public long getWorkTicketNumber() {
        return workTicketNumber;
    }

    // setter method for WorkTicketNumber and validating its value either it is greater than 0 or not
    public void setWorkTicketNumber(long workTicketNumber) {
        if(workTicketNumber > 0) {
            this.workTicketNumber = workTicketNumber;
        } else {
            throw new IllegalArgumentException("Work Ticket Number should be greater than 0 and it should not be a negative number");
        }
    }

    // getter method for ClientID
    public String getClientID() {
        return clientID;
    }

    // setter method for ClientID
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    // getter method for WorkTicketDate
    public LocalDate getWorkTicketDate() {
        return workTicketDate;
    }

    // setter method for workTicketDate field and validating its date is with in 21st century or not
    public void setWorkTicketDate(LocalDate workTicketDate) {
        if(workTicketDate.isBefore(LocalDate.of(2000, 1, 1)) || workTicketDate.isAfter(LocalDate.of(2099, 12, 31))) {
            throw new IllegalArgumentException("Work Ticket Date should not be before 1/1/2000 and should not be after 31/12/2099");
        } else {
            this.workTicketDate = workTicketDate;
        }
    }

    // getter method for IssueDescription
    public String getIssueDescription() {
        return issueDescription;
    }

    // setter method for IssueDescription
    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    // SetWorkTicket method
// Validating WorkTicketNumber, WorkTicketDate, ClientID and IssueDescription filed values and return true if all fields satisfies validation criteria else returning false
    public boolean SetWorkTicket(long workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        if(workTicketNumber > 0) {
            if(workTicketDate.isBefore(LocalDate.of(2000, 1, 1)) || workTicketDate.isAfter(LocalDate.of(2099, 12, 31))) {
                return false;
            } else {
                if(clientID.length() >= 1 && issueDescription.length() >= 1) {
                    this.workTicketNumber = workTicketNumber;
                    this.clientID = clientID;
                    this.workTicketDate = workTicketDate;
                    this.issueDescription = issueDescription;
                    return true;
                }
            }

        } else {
            return false;
        }
        return false;
    }

    // ShowWorkTicket method for printing all fields information
    public void ShowWorkTicket() {
        System.out.println("Work Ticket Number : " + workTicketNumber);
        System.out.println("Client ID : " + clientID);
        System.out.println("Work Ticket Date : " + workTicketDate);
        System.out.println("Issue Description : " + issueDescription);
    }

    public static void main(String[] args) {
// Creating ticket1 object with parameterized constructor
        WorkTicket ticket1 = new WorkTicket(105598, "Client 1", LocalDate.of(2020, 9, 18), "Ticket 1 Description");
// Creating two more objects from WorkTicket class
        WorkTicket ticket2 = new WorkTicket();
        WorkTicket ticket3 = new WorkTicket();

// Declared an array of type WorkTicket and added all three objects into an array
        WorkTicket[] tickets = new WorkTicket[] {ticket1, ticket2, ticket3 };

// Created a loop to assign values to the existing WorkTicket objects by using SetWorkTicket method
        for(int i = 1; i <= tickets.length; i++) {
            tickets[i-1].SetWorkTicket(i, "Client " + i, LocalDate.of(2020, 9, i), "Issue Description " + i);
        }

// Created a loop statement to print information of three objects
        for(WorkTicket ticket : tickets) {
            ticket.ShowWorkTicket();
        }
    }
}