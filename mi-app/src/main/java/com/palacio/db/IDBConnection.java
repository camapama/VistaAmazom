package com.palacio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.palacio.db.DataBase.*;

public interface IDBConnection {
  default Connection connectionToDB() {
    Connection connection = null;
    try {
       
      // Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      connection = DriverManager.getConnection(URL + DB, USER, PASSWORD);
      if (connection != null)
        System.out.println("Conexion establecida :)");
      else 
        System.out.println("Error en la Conexion :(");
    } catch (SQLException e) {
     System.err.println(e.getMessage());
     System.exit(1);
   } finally {
      return connection;
    }
  }
}