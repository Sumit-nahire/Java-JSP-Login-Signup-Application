
# Java JSP Login/Signup Application 🚀
This is a simple web application demonstrating user authentication (Login and Signup) using Java Server Pages (JSP), JavaBeans (Model), and JDBC for database interaction.

# Prerequisites 📋
**1)Java Development Kit (JDK)**: Version 8 or higher.

**2)A Web Server/Container**: Like Apache Tomcat (recommended).

**3)MySQL Database**: To store user login credentials.

**4)MySQL JDBC Driver**: The connector jar file (e.g., mysql-connector-j-8.0.32.jar).

 # Setup and Configuration 🛠️
**1. Database Setup**
The application uses a MySQL database named sumit with a table named login.

**Database Details** (from LoginDao.java):

URL: jdbc:mysql://localhost:3306/sumit

User: root

Pass: root

**SQL to create the database and table:**
-- Create the database
CREATE DATABASE sumit;

-- Use the newly created database
USE sumit;

-- Create the login table
CREATE TABLE login (
    uname VARCHAR(255) NOT NULL PRIMARY KEY,
    pass VARCHAR(255) NOT NULL
);

-- Optional: Insert a test user
-- INSERT INTO login (uname, pass) VALUES ('testuser', 'testpass');
**Note**: If your database credentials are different, you must update the url, user, and pass variables in the Model.LoginDao.java file.

 # How to Run 🏃
Place the JSP files (.jsp) and Java source files (.java) in the appropriate directories of your Tomcat web application structure (e.g., within webapps/yourAppName/). The Model package classes must be compiled and placed in the WEB-INF/classes folder.

Add the MySQL JDBC Driver JAR file to your web application's WEB-INF/lib directory.

Start your Tomcat server.

Open a web browser and navigate to the application's starting page: http://localhost:8080/yourAppName/index.jsp (adjust the URL as necessary).

 # Usage 📝

1)New User Signup: Click the "Signup" link on index.jsp , fill out the form on newuser.jsp, and submit. The createuser.jsp will process the request and confirm if the user was created.
2)
🚀 Java JSP Login/Signup Application
This is a simple web application demonstrating user authentication (Login and Signup) using Java Server Pages (JSP), JavaBeans (Model), and JDBC for database interaction.


.






