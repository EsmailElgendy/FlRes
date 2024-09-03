package com.airline;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<SystemUser> users = new ArrayList<SystemUser>();


    public UserService() {
        // Adding some users and admins for testing
        users.add(new Administrator( "Esmail", "0000"));
        users.add(new Passenger("Som3a", "1234"));
    }


    public void initialUsers() {
        this.users.add(new Administrator("ahmed","0000"));
        this.users.add(new Administrator("gamal","1234"));
        this.users.add(new Passenger("mohamed","5678"));
        this.users.add(new Passenger("james","5698"));
    }
    public List<SystemUser> getUsers() {
        return this.users;
    }


    public boolean login(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return false;
        }

        UserService service = new UserService();
        for (SystemUser user : service.getUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }







    public SystemUser check (String username, String password) {
//        for(int i = 0 ; i < users.size(); i++) {
//            SystemUser systemUser = users.get(i);
//            if (systemUser.getUsername().equals(username) && systemUser.getPassword().equals(password)) {
//                return systemUser;
//            }
//        }
        for (SystemUser systemUser : users) {
            if (systemUser.getUsername().equals(username) && systemUser.getPassword().equals(password)) {
                return systemUser;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return super.toString();
    }

}
