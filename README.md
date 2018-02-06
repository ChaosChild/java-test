Classes in the Project

a) CSVOperations
	Contains three methods:
	1 determineFilePath() which returns the user home file path based on the Environment.
	2. createFile() Which takes a List of Departments and writes them into a CSV comma 	   delimitted file and returns nothing.
	3. readFile() which takes no parameter, reads a csv file and returns a list of departments.

b) DepartmentOperations
	Contains one method:
	1 mergeDepartments() which takes a vararg Departments array and merge them summing Amount on duplicate Departments.
	
c) JavaTest
	Contains the main method which invokes all the classes above and prints to the Console.
	It also contains Department sorting functionality
	
d) SomeData
	Contains 3 Methods that all return an array of departments

e) Departments
	Is the Object that contains getters and setters for the Department.