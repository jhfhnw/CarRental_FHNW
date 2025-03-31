# CarRental_FHNW
Car rental project "Internet Technologies"
Analysis
Scenario
User Stories
Use Case
UC 100: create Car 	100	Stakeholders
Create new car	101	Technical services
Delete car	102	Technical services
UC 200: Booking	200	Stakeholders
Book car	201	Employee/ Department head
Change booking	202	Employee/ Department head
Cancel booking	203	Employee/ Department head
Filter by car	204	All stakeholders
Submit damage	205	Employee/ Department head
		
 
Use Case ID	Create new car
Use Case Number	101
Description	The system shall allow the technical services to create a new car.
Responsible Actor	Technical services
Participating Actor	-
Trigger	Technical services want to add a new car.
Preconditions	Role of actor verified with Meta-Workflow
Inputs	Vehicle type, vehicle name, plates number, availability status, vehicle picture
Scenario	Main	Alternative
 	1. Responsible actor clicks on "Add new car"	 
 	2. System opens overview about car properties and asks for input	 
 	3. Responsible actor enters input	 
 	4. Responsible actor clicks on "Save new car"	 
 	5. System validates input	5a. Input is invalid
 	 	5a1. Back to step 3
 	6. System saves new car	 
Result	New car is available in the system.	 
Postconditions	Employees/ Department head can book a new car.	 

Use Case ID	Delete car
Use Case Number	102
Description	The system shall allow the technical services to delete existing cars.
Responsible Actor	Technical services
Participating Actor	-
Trigger	Technical services want to delete a car.
Preconditions	UC 101: Create new car, Role of actor verified with Meta-Workflow
Inputs	-
Scenario	Main	Alternative
 	1. Responsible actor clicks on a specific car and then "Edit car".	 
 	2. Responsible actor clicks on "delete car".	 
 	3. Responsible actor clicks on "delete car".	 
 	4. System asks responsible actor if they are sure about deleting the car.	 
 	 	4a. Responsible actor clicks on "no"
 	 	4a1. Back to Step 1.
 	5. System removes car from database.	 
Result	Car is deleted in the database	 
Postconditions	-	 

Use Case ID	Create maintenance interval
Use Case Number	103
Description	The system shall allow the technical services to create maintenance intervals for each car.
Responsible Actor	Technical services
Participating Actor	-
Trigger	Technical services wants to add maintenance interval.
Preconditions	UC 101: Create new car, Role of actor verified with Meta-Workflow
Inputs	Car, date of maintenance, duration, frequency of maintenance
Scenario	Main	Alternative
 	1. Responsible actor clicks on the respective car	 
 	2. Responsible actor clicks on "new maintenance"	 
 	3. Responsible actor enters input	 
 	4. Responsible actor clicks on "save maintenance"	 
 	 	4a. Input is invalid
 	 	4a1. Back to step 3
 	5. System adds new maintenance date to database	 
Result	New maintenance date is saved 	 
Postconditions	-	 

Use Case ID	Edit maintenance interval
Use Case Number	104
Description	The system shall allow the technical services to edit maintenance intervals for each car.
Responsible Actor	Technical services
Participating Actor	-
Trigger	Technical services wants to edit maintenance.
Preconditions	UC 103: Create maintenance interval, Role of actor verified with Meta-Workflow
Inputs	Existing maintenance interval, car, date of maintenance, duration, frequency of maintenance
Scenario	Main	Alternative
 	1. Responsible actor clicks on the respective car	 
 	2. Responsible actor clicks on "edit maintenance"	 
 	3. Responsible actor edits the required input.	 
 	4. Responsible actor clicks on "save maintenance" 	4a. Input is invalid
4a1. Back to step 3
 	5. System adds new input to the database	 
Result	New maintenance input is saved	 
Postconditions	-	 

Use Case ID	Add vehicle types
Use Case Number	105
Description	The system shall allow the technical services to add a new vehicle type.
Responsible Actor	Technical services
Participating Actor	-
Trigger	Technical services wants to add a new vehicle type.
Preconditions	Role of actor verified with Meta-Workflow
Inputs	List of vehicle types, Name of new vehicle type
Scenario	Main	Alternative
 	1. Responsible actor clicks on the "list of vehicle types" and then on "Add vehicles type"	 
 	2. Responsible actor edits the required input.	 
 	3. Responsible actor clicks on "save vehicle type" 	4a. Input is valid
 	 	4b. Input is invalid
 	 	4b1. Back to step 2
 	4. System adds new vehicle type to the "List of vehicle types"	 
Result	Technical services have an overview of all vehicle types in the system.	 
Postconditions	New vehicle type can be taken as input for “UC 101: Create new car”	 


Design
Wireframe
Prototype
Domain Design
Business Logic
Implementation
Backend Technology
Frontend Technology
Execution
Deployment to a PaaS
Project Management
Roles
Milestones

