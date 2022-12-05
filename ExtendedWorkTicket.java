/*
File_Name            :-  OOP2_LAB-3.java .
Students Name and ID :-  Harsh Patel(100849927)
						 Kanvi Patel(100842924).
Date                 :-  04 DEC 2022.
Course Name	         :-  Object Oriented Programming - 2.
Course Code 		 :-  OOP3200.

*/

import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket {
    private boolean myOpen;

    boolean isOpen() {
        return myOpen;
    }

    void openTicket() {
        this.myOpen = true;
    }

    void closeTicket() {
        this.myOpen = false;
    }

    public ExtendedWorkTicket() {
        super();
        openTicket();
    }

    public ExtendedWorkTicket(long workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        super(workTicketNumber, clientID, workTicketDate, issueDescription);
        openTicket();
    }

    public ExtendedWorkTicket(WorkTicket wt) {
        super(wt.getWorkTicketNumber(), wt.getClientID(), wt.getWorkTicketDate(), wt.getIssueDescription());
        openTicket();
    }

    @Override
    public boolean SetWorkTicket(long workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        if (super.SetWorkTicket(workTicketNumber, clientID, workTicketDate, issueDescription)) {
            openTicket();
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String output = super.ShowWorkTicket();
        String ticketState = isOpen() ? "OPEN" : "CLOSED";
        output = output = output + "\n" + "Ticket: " + ticketState;
        return output;
    }

    public static void main(String[] args) {
        ExtendedWorkTicket ewt = new ExtendedWorkTicket();
        System.out.println(ewt.toString());

        ewt = new ExtendedWorkTicket(105598, "Client 1", LocalDate.of(2020, 9, 18), "Ticket 1 Description");
        System.out.println(ewt.toString());

        ExtendedWorkTicket ewtClone = new ExtendedWorkTicket(ewt);
        System.out.println(ewtClone.toString());
        ewtClone.SetWorkTicket(1111, "Client 2", LocalDate.of(2021, 5, 1), "extended SetWorkflowTicket");
        System.out.println(ewtClone.toString());


    }
}
