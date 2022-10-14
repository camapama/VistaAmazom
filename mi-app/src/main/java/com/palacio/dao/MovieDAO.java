package com.palacio.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.palacio.model.Movie;
import com.palacio.db.IDBConnection;
import static com.palacio.db.DataBase.*;

public interface MovieDAO extends IDBConnection{
  default Movie setMovieViewed(Movie movie){
    return movie;
  }
  default ArrayList<Movie> read(){
    ArrayList<Movie> movies=new ArrayList<Movie>();
    //llamamos a la conexion
    try (Connection connection=connectionToDB()){//para que se cierren los recursos
      String sql="SELECT * FROM "+ TMOVIE;
      PreparedStatement preparedStatement=connection.prepareStatement(sql);     
      ResultSet rs=preparedStatement.executeQuery();
      while(rs.next()){
       Movie movie =new Movie(
         rs.getString(TMOVIE_TITLE),
         rs.getString(TMOVIE_GENRE),
         rs.getString(TMOVIE_CREATOR),
         Integer.valueOf(rs.getString(TMOVIE_DURATION)),
         Short.valueOf(rs.getString(TMOVIE_YEAR))); 
        movie.setId(Integer.valueOf(rs.getString(TMOVIE_ID)));
      }
    }catch(SQLException e){
     // e.printStackTrace();
    }
    return movies;
  }
  private boolean getMovieViewed(){
    return false;
  }
}