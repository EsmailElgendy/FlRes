package com.airline;

public class Administrator extends SystemUser implements AddFlight {


    public Administrator(String name, String pass) {
        this.setUsername(name);
        this.setPassword(pass);
        this.setUserType(UserType.ADMIN);
    }

    @Override
    public boolean addFlight(Flight flight) {
        return false;
    }


    @Override
    public String toString() {
        return "Administrator [getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getUserType()=" + getUserType() + "]" ;
    }
}
