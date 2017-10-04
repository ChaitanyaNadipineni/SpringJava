package OneToOne;

import Hibernate.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args){
       String jdbcurl="jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false";
String user="hbstudent";
String pass="hbstudent";




try{
    System.out.println("connecting to database"+jdbcurl);
    Connection myconn= DriverManager.getConnection(jdbcurl,user,pass);
    System.out.println("connection done");
} catch (SQLException e) {
    e.printStackTrace();
}
    }
}
