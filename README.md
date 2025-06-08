# CarRental_FHNW

CarRental_FHNW is a minimal Reference Project for car rental management, serving as a template for students in Internet Technologies.  
**🚧: This is a template project. Adapt the documentation and code according to your use case. Remove all comments marked with "🚧:" before final submission.**

---

## Contents

- Analysis
  - Scenario
  - User Stories
  - Use Case
- Design
  - Prototype Design
  - Domain Design
  - Business Logic
- Implementation
  - Backend Technology
  - Frontend Technology
- Project Management
  - Roles
  - Milestones

---

## Analysis

**🚧: Reuse and adapt your own analysis and requirements here.**

### Scenario

CarRental_FHNW is a lightweight demonstration system enabling technical services and staff to manage a catalog of rental cars, bookings, and maintenance. It provides both administrative and user-facing functionality.

### User Stories

- As a Technical Service Admin, I want a web app accessible on both mobile devices and desktop computers.
- As an Admin, I want a consistent visual appearance for easy navigation.
- As an Admin, I want to list, edit, and create cars, bookings, and maintenance intervals.
- As an Admin, I want to log in for authentication.
- As an Employee/Department Head, I want to book and manage car reservations.
- As a User, I want to view available cars and filter by type or availability.
- (Optional) As a User, I want to authenticate to access personal data.

### Use Cases

- **UC-1 [Show all Cars]:** Admin can retrieve all cars in the system.
- **UC-2 [Show Car Details]:** Admin or user can retrieve details of a specific car.
- **UC-3 [Manage Cars]:** Admin can create, update, and delete cars.
- **UC-4 [Manage Bookings]:** Employees/Department Heads can create, update, and cancel bookings.
- **UC-5 [Submit Damage]:** Employees/Department Heads can submit reports of car damage.
- **UC-6 [Manage Maintenance]:** Admin can create or edit maintenance intervals.
- **UC-7 [Filter Cars]:** Users can filter available cars by type, status, etc.

---

## Design

**🚧: Decide on your CI, color scheme, graphics, layout, and UX. Add wireframes and diagrams as needed.**

### Wireframe

**🚧: Start with a sitemap and wireframe (draw.io or similar). List the main pages: Home, Car List, Booking, Maintenance, Admin.**

### Prototype

**🚧: Optionally, create a prototype using placeholder data.**

### Domain Design

**🚧: Provide an entity-relationship or UML class diagram.**

Main domain entities may include: Car, Booking, Maintenance, User, VehicleType.

### Business Logic

**Example:**

For booking a car (UC-4):

- **Path:** `/api/bookings`
- **Method:** `POST`, `GET`, `PUT`, `DELETE`
- **Logic:** Employees can create, modify, or cancel bookings for available cars. The system checks for overlapping bookings and car availability.

API documentation available at `/swagger-ui.html`.

---

## Implementation

### Backend Technology

- Spring Boot
- Spring Data JPA
- Java Persistence API (JPA)
- H2 Database (in-memory or persistent)

**Dependencies (excerpt):**
```xml
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.3.0</version>
</dependency>
```

**🚧: Describe if you used Spring Initializr or adapted dependencies. Document database setup (in-memory/persistent) and placeholder data initialization.**

### Frontend Technology

**🚧: List the frontend framework or app builder used (e.g., Budibase, React, Angular). Describe main views and APIs used for each view.**

---

## Execution

**🚧: List steps to run the application and update configurations. For Codespaces or local environments:**

1. Clone the repository.
2. Start the backend (`CarRentalApplication.java`).
3. Open required ports as needed.
4. Deploy or connect the frontend app.
5. Update API endpoints in frontend datasource configuration.

**Deployment to PaaS (Optional):**

- Use Dockerfile provided in the root (adapt jar name as needed).
- Deploy to Render or a similar PaaS.
- Link backend API to your frontend app.

---

## Project Management

### Roles

- Backend Developer: [Your Name]
- Frontend Developer: [Your Name]
- (Add more roles as needed)

### Milestones

- Analysis and Requirements
- Prototype and Wireframe
- Domain Model Design
- Business Logic & API Design
- Backend and Data Layer Implementation
- Frontend and Security Integration
- (Optional) Deployment

---

## Maintainers

- [Your Name(s)]

---

## License

Apache License, Version 2.0

---
