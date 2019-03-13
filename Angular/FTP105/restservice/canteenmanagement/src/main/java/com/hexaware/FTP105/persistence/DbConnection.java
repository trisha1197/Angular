package com.hexaware.FTP105.persistence;

import org.skife.jdbi.v2.DBI;

/**
 */
public class DbConnection {
  /**
   * Connecting to MYSQL DB.
   *
   * @return database Connection.
   */
  public final DBI getConnect() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String dbc = System.getenv("DB_CONNECTION");
      if (dbc == null || dbc.equals("")) {
        dbc = "localhost:3306";
      }
      DBI dbi = new DBI("jdbc:mysql://" + dbc + "/FTP105?useSSL=false", "FTP105", "FTP105");
      return dbi;
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
