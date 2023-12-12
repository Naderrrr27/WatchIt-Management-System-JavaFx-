package com.example.uservalidation;

public class User {

    //to assign unique userId and to know how many users
    protected static int userIdCounter;

    protected int userId;
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String email;
    protected String password;
    protected boolean active;

    public User(String fName, String lName, String uName, String mail, String pass)
    {
        this.userId = ++userIdCounter;
        setFirstName(fName);
        setLastName(lName);
        setUserName(uName);
        setEmail(mail);
        setPassword(pass);
    }

    //Setter
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    //Getter
    public int getUserId()
    {
        return userId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public void getInfo()
    {
        System.out.println("Id : "+Integer.toString(getUserId()));
        System.out.println("First Name : "+getFirstName());
        System.out.println("Last Name : "+getLastName());
        System.out.println("Username : "+getUserName());
        System.out.println("Email : "+getEmail());
        System.out.println("Password : "+getPassword());
    }

}
