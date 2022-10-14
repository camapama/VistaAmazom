package com.palacio.db;

public class DataBase{
  //jdbc:mysql://localhost/test?" +"user=minty&password=greatsqldb"
public static final String URL="jdbc:mysql://sql10.freemysqlhosting.net:3306/"; 
public static final String DB="sql10526297";
public static final String USER="sql10526297";
public static final String PASSWORD="lSTRdhCUei";

  //Mapear las tablas
  //TABLE `movie`
  public static final String TMOVIE="MOVIE";
  public static final String TMOVIE_ID="id";
  public static final String TMOVIE_TITLE="title";
  public static final String TMOVIE_GENRE="genre";
  public static final String TMOVIE_CREATOR="creator";
  public static final String TMOVIE_DURATION="duration";
  public static final String TMOVIE_YEAR="year";
  
  // TABLE `material` 
  /* public static final String TMATERIAL_ID="id";
  public static final String TMATERIAL_NAME="name";*/
  public static final String TMATERIAL="material";
  public static final int[] ID_TMATERIALS={1,2,3,4,5};
  
  
  //TABLE `user`
  /*public static final String TUSER_ID="id"; 
  public static final String TUSER_NAME="name";*/
public static final String TUSER="user"; 
  public static final int TUSER_IDUSUARIO=1;
  
  /*TABLE `viewed`*/
  public static final String TVIEWD="viewed";
  public static final String TVIEWD_ID_MATERIAL="id_material";
  public static final String TVIEWD_ID_ELEMENT="id_element";
  public static final String TVIEWD_ID_USER="id_user"; 

}