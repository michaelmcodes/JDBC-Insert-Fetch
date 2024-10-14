# JDBC_Insert_Fetch

Demo using JDBC to insert and fetch data to MySQL database.

InsertData.java: gets data from user input, loads and registers MySQL driver, connects to local sql database, runs the insert query and tracks the rows affected. 

FetchData.java: loads and registers MySQL driver, connects to local sql database, fetches and prints the data from the table.

How to run:

javac -cp ".:lib/mysql-connector-j-9.0.0.jar" src/InsertData.java
java -cp ".:lib/mysql-connector-j-9.0.0.jar:src" InsertData

javac -cp ".:lib/mysql-connector-j-9.0.0.jar" src/FetchData.java
java -cp ".:lib/mysql-connector-j-9.0.0.jar:src" FetchData

