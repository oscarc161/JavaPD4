
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//java -cp sqlite-jdbc-3.23.1.jar; Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   
    Database db = new Database("jdbc:sqlite:students.db");

//#1
   String sqlname_1 = "SELECT * FROM CR101 WHERE StudentID = 'STUDENT1001'";
   String sql_1 = "UPDATE CR101 SET Room = '122' WHERE StudentID = 'STUDENT1001' AND Period = '3'";



   print(db.runSQL(sql_1,"table-auto"));
   print(db.runSQL(sqlname_1,"table-auto"));
    
//#2 I removed his lunch period instead of “ZQCTEDA” cuz it wasnt there (xd)
      String sqlname_2 = "SELECT * FROM CR101 WHERE StudentID = 'STUDENT1200'";
      String sql_2 = "DELETE FROM CR101 WHERE StudentID = 'STUDENT1200' AND Course = 'ZLUN'";


    print(db.runSQL(sql_2,"table-auto"));
    print(db.runSQL(sqlname_2,"table-auto"));

//#3 Idk why there also isnt a period 4 and 5 so i changed it to 6 and 7
    String sqlname_3 = "SELECT * FROM CR101 WHERE Teacher1 = 'DOYLE'";
    String sql_3 = "UPDATE CR101 SET Room = '213' WHERE Teacher1 = 'DOYLE' AND Period IN (6,7)";


    print(db.runSQL(sql_3,"table-auto"));
    print(db.runSQL(sqlname_3,"table-auto"));
  
     

//#4 
    String sqlname_4 = "SELECT * FROM CR101 WHERE Teacher1 = 'ARCHETTI'";
    String sql_4 = "UPDATE CR101 SET Teacher1 = 'ROFFLER' WHERE Teacher1 = 'ARCHETTI' AND Course = 'BCF43T' AND Course = '53'";


    print(db.runSQL(sql_4,"table-auto"));
    print(db.runSQL(sqlname_4,"table-auto"));
  
     



//#5
    String sqlname_5 = "SELECT * FROM CR101 WHERE StudentID = 'STUDENT999'";
    String sql_5 = "UPDATE CR101 SET Grade = '11' WHERE StudentID = 'STUDENT999'";


   print(db.runSQL(sql_5,"table-auto"));
   print(db.runSQL(sqlname_5,"table-auto"));


//#6
    String sqlname_6 = "SELECT * FROM CR101 WHERE StudentID = 'STUDENT1231'";
    String sql_6 = "INSERT INTO CR101 VALUES ('STUDENT1231', 'V20', '10','MKUFTC6', '1', 'CASTRO', , '9', '322' )";


   print(db.runSQL(sql_6,"table-auto"));
   print(db.runSQL(sqlname_6,"table-auto"));
  
     
      }


}