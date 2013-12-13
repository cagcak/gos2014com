package iaau.mas.dao;

/**
 * Created by Çağrı on 12.12.2013
 * *********************************
 * This is a "JDBC Realm" sub-class that defines the Data Source
 * the "JDBC Realm" should use
 *
 * The configuration specified in web.xml will cause an object of
 * this class to be injected into the SecurityManager
 */
import org.apache.shiro.realm.jdbc.JdbcRealm;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class RoleSecurityJdbcRealm extends JdbcRealm
{
    public RoleSecurityJdbcRealm()
    {
        super();

        // We get the Data Source that JSecurity's JdbcRealm should use to
        // find the user's password using the provided username.
        // For this Data Source's properties: see the context.xml

        InitialContext initialContext;
        DataSource dataSource;

        try {
                initialContext = new InitialContext();
                dataSource = (DataSource) initialContext.lookup("java:/comp/env/jdbc/security");
                this.setDataSource(dataSource);
            }catch (NamingException e)
                {
                    e.printStackTrace();
                }
    }
}