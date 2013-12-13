package iaau.mas.model;
/**
 * Created by Çağrı on 12.12.2013
 * ********************************
 * This class models (biçime, kalıba sokar) a user data
 */
public class User
{
    private long id_user;
    private String username;
    private String password;
    /////////////////////////////////////////
    public long getUserID()
    {
        return id_user;
    }
    public void setUserID(long id_user)
    {
        this.id_user = id_user;
    }
    //////////////////////////////////////////
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    //////////////////////////////////////////
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
}