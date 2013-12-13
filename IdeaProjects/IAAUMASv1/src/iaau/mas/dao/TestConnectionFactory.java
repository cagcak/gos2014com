package iaau.mas.dao;

import com.sun.org.apache.regexp.internal.recompile;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Çağrı on 12.12.2013
 * *********************************
 * This class tests the connection between data sources modelled and db.
 * We can call this class as a main class.
 */
public class TestConnectionFactory
{
    public static void main(String[]args)
    {
        Connection aConnection = null;

        try {
            aConnection = ConnectionFactory.getConnection();

            System.out.println("Connection successfully received :-)");
            DatabaseMetaData metaData = aConnection.getMetaData();

            System.out.println("Database name: " + metaData.getDatabaseProductName());
            System.out.println("Information about databases\n-----------------------------");
            System.out.println("Database name: [ " + metaData.getDatabaseProductName() + "]");
            System.out.println("Database version: [ " + metaData.getDatabaseProductVersion() + "]");
            System.out.println("Driver name: [ " + metaData.getDriverName() + "]");
            System.out.println("Driver version: [" + metaData.getDriverVersion() + "]");
            System.out.println("\n***************************************************");
            System.out.println("Information about stored procedure support:");
            System.out.println("Vendors name for \'procedure\': [ " + metaData.getProcedureTerm() + "]");
            System.out.println("All procedures are callable: [ " + metaData.allProceduresAreCallable() + "]");
            System.out.println("Supports stored procedures: [" + metaData.supportsStoredProcedures() + "]");

            ResultSet resultSet = metaData.getProcedures(null, null, null);
            System.out.println("Procedures stored in the datbase \'iaaumasDB\': ");

            int count = 0;
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("PROCEDURE_NAME") + " ");

                if (count++ > 25)
                {
                    break;
                }
            }
            System.out.println();
            System.out.println("Supports forward only ResultSet: [" + metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY) + "]");
            System.out.println("Supports scroll sensitive ResultSet: [" + metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE) + "]");
            System.out.println("Supports scroll insensitive ResultSet: [" + metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE) + "]");
            System.out.println("Supports updatable ResultSet: [" + metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE) + "]");
            System.out.println("Supports ANSI92 entry: [" + metaData.supportsANSI92EntryLevelSQL() + "]");
            System.out.println("Supports ANSI92 intermediate: [" + metaData.supportsANSI92IntermediateSQL() + "]");
            System.out.println("Supports ANSI92 full: [" + metaData.supportsANSI92FullSQL() + "]");

            PreparedStatement preparedStatement = null;

            System.out.println("\n\nHere are the users from the database:");
            String query = "SELECT * FROM users " ;

            preparedStatement = aConnection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                System.out.println("User ID: " + resultSet.getString("id_user"));
                System.out.println("Username: " + resultSet.getString("username"));
                System.out.println("Password: " + "YOU CANNOT BE ALLOWED!");
            }
        }catch (Exception e)
            {
                e.printStackTrace();
            }finally
                {
                    ConnectionFactory.close(aConnection);
                }
    }
}
