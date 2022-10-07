/*
File_Name            :-  OOP2_LAB-3.cpp .
Students Name and ID :-  Harsh Patel(100849927)
						 Kanvi Patel(100842924).
Date                 :-  9 Oct 2022.						 
Course Name	         :-  Object Oriented Programming - 2.
Course Code 		 :-  OOP3200.			 

*/


#include <iostream>		
#include <iomanip> 		
#include <stdexcept>	
#include <sstream>
#include "WorkTicket.h"


class ExtendedWorkTicket:public WorkTicket {
	private:
		bool isOpen;

	
	public:
		ExtendedWorkTicket()
		{
			WorkTicket();
			OpenTicket();
		};
		
	//parameterized contuctor for inherited attributes.
		ExtendedWorkTicket(int ticketNumber, string clientId, int day, int month, int year, string description,bool isOpen){
			WorkTicket(ticketNumber, clientId,  day,  month, year,  description);		
			OpenTicket();
		}
	
	//overload SetWorkTicket()
		bool SetWorkTicket(int ticketNumber, string clientId, int day, int month, int year, string description,bool isOpen)
		{
			
			OpenTicket();
			return WorkTicket::SetWorkTicket(ticketNumber,clientId,day,month,year,description);
		}

	// open and close isOpen method.
		bool OpenTicket(){
			isOpen = true;
		}
		bool CloseTicket(){
			isOpen = false;
		}
};



int main()
{
	/* FIX THIS BY IMPLEMENTING A WORKING ExtendedWOrkTicket Class*/
	ExtendedWorkTicket testTicket1;
	ExtendedWorkTicket testTicket2(1, "AMCE_123", 1, 7, 2014, "Password Reset", true);

	std::cout << std::endl << "As Initialized: " << std::endl;
	testTicket1.ShowWorkTicket();
	testTicket2.ShowWorkTicket();


	if (!testTicket1.SetWorkTicket(2, "MACDONALD-001", 10, 3, 2012, "User cannot locate \'any\' key.", true))
		std::cout << "\nErrors! No changes to the ticket made." << std::endl;

	std::cout << std::endl << "Ticket 1: " << testTicket1 << std::endl;

	if (!testTicket2.SetWorkTicket(-1, "BLAGO-042", 13, 32, 11, "", false))
		std::cout << "\nErrors! No changes to the ticket made." << std::endl;

	std::cout << std::endl << "Ticket 2: " << testTicket2 << std::endl;

	testTicket2.CloseTicket();

	std::cout << std::endl << "After Ticket 2 closed: " << testTicket2 << std::endl;

	std::cout << std::endl << std::endl;
	return 0;
}




