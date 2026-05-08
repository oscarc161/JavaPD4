import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    //songs
    int port1 = 8500;
    //employees
    int port2 = 8600;
    // customers
    int port3 = 8700;
      
    //create the HTTPserver object
    HttpServer server_songs = HttpServer.create(new InetSocketAddress(port1),0);
    HttpServer server_employees = HttpServer.create(new InetSocketAddress(port2),0);
    HttpServer server_customers = HttpServer.create(new InetSocketAddress(port3),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    
   // Add your  code here
    
    server_songs.createContext("/", new RouteHandler("You are connected, but route not given or incorrect....") );
    server_employees.createContext("/", new RouteHandler("You are connected, but route not given or incorrect....") );
    server_customers.createContext("/", new RouteHandler("You are connected, but route not given or incorrect....") );
    String sql1 = "SELECT * FROM tracks";
    String sql2 = "SELECT * FROM employees";
    String sql3 = "SELECT * FROM customers";

  

    server_songs.createContext("/songs", new RouteHandler(db,sql1));
    server_employees.createContext("/employees", new RouteHandler(db,sql2));
    server_customers.createContext("/customers", new RouteHandler(db,sql3));

  
    //Start the server
    server_songs.start();
    server_employees.start();
    server_customers.start();
       
      
    }    
}


