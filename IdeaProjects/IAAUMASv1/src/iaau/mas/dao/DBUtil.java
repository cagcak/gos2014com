package iaau.mas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Çağrı on 11.12.2013
 * *******************************
 * This class has basic static methods used to close SQL package objects like Statement
 */
public class DBUtil
{
    public static void closeStatement(Statement statement)
    {
        try {
            if (statement != null)
            {
                statement.close();
            }
        }catch (SQLException e)
            {
                e.printStackTrace();
            }
    }

    public static void closePreparedStatement(Statement ps)
    {
        try {
            if (ps != null)
            {
                ps.close();
            }
        }catch (SQLException e)
            {
                e.printStackTrace();
            }
    }

    public static void closeResultSet(ResultSet resultSet)
    {
        try {
            if (resultSet != null)
            {
                resultSet.close();
            }
        }catch (SQLException e)
            {
                e.printStackTrace();
            }
    }
}
