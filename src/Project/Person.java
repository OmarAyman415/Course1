package Project;

public class Person
{
    private String Username;
    private String Password;
    private int ID;

    public Person()
    {

    }

    public Person(String username, String password, int ID)
    {
        Username = username;
        Password = password;
        this.ID = ID;
    }

    public String getUsername()
    {
        return Username;
    }

    public String getPassword()
    {
        return Password;
    }

    public int getID()
    {
        return ID;
    }

    public void setUsername(String username)
    {
        Username = username;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }
}
