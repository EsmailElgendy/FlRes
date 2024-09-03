package com.airline;

public abstract class SystemUser {
    private String username;
    private String password;
    private UserType userType;

    public SystemUser() {}

    public SystemUser(String username, String password, UserType userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public boolean login(String username, String password) {
        UserService service = new UserService();

        boolean result = false;
        for(SystemUser user : service.getUsers()) {
            if (user.username.equals(username) && user.password.equals(password)) {
                result = true;
                break;
            }
        }

        return result;
    }




    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "userType=" + userType +
                '}';
    }
}
