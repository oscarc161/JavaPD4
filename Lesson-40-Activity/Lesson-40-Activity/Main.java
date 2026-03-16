
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: *.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    Database db = new Database("jdbc:sqlite:students.db");
   

    String sql_1 ="SELECT * FROM cr101 WHERE teacher1 = 'BANU';";

    print(db.runSQL(sql_1,"table-auto"));

    String sql_2 ="SELECT * FROM cr101 WHERE teacher1 = 'PORCHETTA' AND Period = '10';";

    print(db.runSQL(sql_2,"table-auto"));

    String sql_3 ="SELECT StudentID FROM cr101;";

    print(db.runSQL(sql_3,"table-auto"));


   

    


    
     
  }    
}