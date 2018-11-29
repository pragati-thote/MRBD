package com.Datatables;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	
	
	DatabaseVariables objDB = new DatabaseVariables();
	public void Connect(){
    try {
      Class.forName(objDB.strSQLite);
      objDB.conn = DriverManager.getConnection(objDB.strDBPath);
      objDB.conn.setAutoCommit(false);
      System.out.println("Opened database successfully");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
  }
	
	//This method will execute the sql queries to fetch/update data.
    public void exeQuery(String query) throws SQLException{
    	objDB.stmt = null;
    	objDB.stmt = objDB.conn.createStatement();
	  	objDB.stmt.executeUpdate(query);
	  	objDB.stmt.close();
	  	objDB.conn.commit();
  }
}
