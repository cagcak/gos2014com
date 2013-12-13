/**
 * Created by Çağrı on 11.12.2013
 * *******************************
 * This class is used by the other classes to get
 * a connection to the data storage.
 *
 * This static class manages the connection and
 * associated resources.
 */
package iaau.mas.dao;

import java.sql.*;

public class ConnectionFactory
{
    @SuppressWarnings("unused")
    // We make the constructor reference "ref" as private and static to initialize the DriverManager
    private static ConnectionFactory ref = new ConnectionFactory();

    //With this private default constructor, no outside objects can create an object of this class
    private ConnectionFactory()
    {
        String driverName = "org.apache.derby.jdbc.EmbeddedDriver";
        System.out.println("Sınıf: ConnectionFactory\nSatır: 21\nMevki: Yapıcı Metod");

        try
        {
            Class.forName(driverName);
        } catch (ClassNotFoundException e)
            {
                System.out.println("Hata: driver sınıfını yüklerken istisna hatası");
                System.out.println(e.getMessage());
            }
    }

    //To connect to the Data Storage (Database), use a connection object
    public static Connection getConnection() throws SQLException
    {
        System.out.println("Bağlantı alımında...");
        String dbName = "iaaumasDB";
        //We connect to the database 'iaaumasDB' which is a Derby Database here
        String sourceURL = "jdbc:derby:C:/Users/Administrator/IdeaProjects/IAAUMASv1/db/" + dbName + ";create=false";
        String userName = "users";
        String password = "password";

        return DriverManager.getConnection(sourceURL, userName, password);
    }

    //We close the ResultSet named as 'resultSet' here
    public static void close(ResultSet resultSet)
    {
        try {
            resultSet.close();
        }catch (SQLException e)
            {
                System.out.println("HATA: Result Set kapatılamıyor..");
                System.out.println(e.getMessage());
            }
    }

    //We close the statement object named as 'statement' here
    public static void close(Statement statement)
    {
        try {
            statement.close();
        }catch (SQLException e)
            {
                System.out.println("HATA: Statement kapatılamıyor...");
                System.out.println(e.getMessage());
            }
    }

    //We close the connection named as 'connection' here
    public static void close(Connection connection)
    {
        try {
            connection.close();
        }catch (SQLException e)
            {
                System.out.println("HATA: statement yada connection kapatılamıyor...");
                System.out.println(e.getMessage());
            }
    }
}