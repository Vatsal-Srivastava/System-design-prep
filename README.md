🧩 Project Overview

This project includes both pure Java implementations and their corresponding Spring Boot implementations of various system design and design pattern concepts.

Each concept is managed through Spring profiles — allowing you to run one implementation at a time.

⚙️ Running Spring Boot Implementations

In the application.properties file, you’ll find:

\# spring.profiles.active=strategydemo  
spring.profiles.active=singletondemo


Simply comment or uncomment the desired profile.
Only one project runs at a time based on the active profile.

Then:

Open SystemDesignApplication.java

Right-click → Run Maven Clean and Maven Install

Run the project → The output will appear in the console.

💡 Running Pure Java Implementations

For pure Java code (non-Spring Boot), just run the Main class inside each individual concept folder directly.