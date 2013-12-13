package iaau.mas.dao;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Çağrı on 11.12.2013
 * *******************************
 * This class looks up (uğrar) the DataSource (see configuration in context.xml)
 * and uses the DataSource to get a database connection from the connection pool.
 */
public class ConnectionPool
{
    private static ConnectionPool pool = null;
    private static DataSource dataSource = null;

    private ConnectionPool()
    {
        try {
            InitialContext ınitialContext = new InitialContext();
            dataSource = (DataSource) ınitialContext.lookup("java:/comp/env/jdbc/security");
        }catch (Exception e)
            {
                e.printStackTrace();
            }
    }

    public static ConnectionPool getInstance()
    {
        if (pool == null)
        {
            pool = new ConnectionPool();
        }
        return pool;
    }

    public Connection getConnection()
    {
        try {
            return dataSource.getConnection();
        }catch (SQLException sqle)
            {
                sqle.printStackTrace();
                return null;
            }
    }

    public void freeConnection(Connection connection)
    {
        try {
            connection.close();
        }catch (SQLException sqle)
            {
                sqle.printStackTrace();
            }
    }
}