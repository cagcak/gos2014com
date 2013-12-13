package iaau.mas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import iaau.mas.model.User;

/**
 * Created by Çağrı on 11.12.2013
 * **********************************
 * This class has some static methods to get either all users
 * or a specific user by "username"
 */
public class UserDAO
{
    //This method gets a specific user from the Data Store
    public static List<User> getUser(String userName)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<User>userList = new ArrayList<User>();

        String query = "SELECT * FROM users " + "WHERE username = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userName);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setUserID(Long.valueOf(resultSet.getString("id_user")));
                user.setPassword(resultSet.getString("password"));

                userList.add(user);
            }
            return userList;
        }catch (SQLException e)
            {
                e.printStackTrace();
                System.out.println("HATA: UserDAO.java 48.satır");
                return null;
            }finally
                {
                    DBUtil.closeResultSet(resultSet);
                    DBUtil.closePreparedStatement(preparedStatement);
                    pool.freeConnection(connection);
                }
    }

    //This method gets all the users from the Data Store
    public static List<User> getAllUsers()
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<User>userList = new ArrayList<User>();

        String query = "SELECT * FROM users ";
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setUserID(Long.valueOf(resultSet.getString("id_user")));
                user.setPassword(resultSet.getString("password"));

                userList.add(user);
            }
            return userList;
        }catch (SQLException e)
            {
                e.printStackTrace();
                System.out.println("HATA: UserDAO.java 86.satır");
                return null;
            }finally
                {
                    DBUtil.closeResultSet(resultSet);
                    DBUtil.closePreparedStatement(preparedStatement);
                    pool.freeConnection(connection);
                }
    }
}