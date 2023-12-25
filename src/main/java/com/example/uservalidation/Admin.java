package com.example.uservalidation;

import java.io.Serializable;

public class Admin extends User implements Serializable {
    public Admin(String fName, String lName, String uName, String mail, String pass) {
        super(fName, lName, uName, mail, pass);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", subscription=" + subscription +
                ", isSubscriptionDone=" + isSubscriptionDone +
                ", movieList=" + movieList +
                ", history=" + history +
                '}';
    }
}
