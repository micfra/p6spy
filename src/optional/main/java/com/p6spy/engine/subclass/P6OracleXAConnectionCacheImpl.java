// this class generated by class com.p6spy.engine.common.Subclasser

package com.p6spy.engine.subclass;

import com.p6spy.engine.spy.*;
import java.sql.*;
import javax.sql.*;
import oracle.jdbc.pool.*;


public class P6OracleXAConnectionCacheImpl extends oracle.jdbc.pool.OracleXAConnectionCacheImpl {

  public P6OracleXAConnectionCacheImpl (javax.sql.ConnectionPoolDataSource p0) throws java.sql.SQLException {
    super( p0);
  }
  public P6OracleXAConnectionCacheImpl () throws java.sql.SQLException {
    super();
  }
  public Connection getConnection() throws SQLException {
    return P6SpyDriverCore.wrapConnection(super.getConnection());
  };

  public Connection getConnection(String username, String password) throws SQLException {
    return P6SpyDriverCore.wrapConnection(super.getConnection(username, password));
  };

}
