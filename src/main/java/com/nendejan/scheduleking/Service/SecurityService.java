package com.nendejan.scheduleking.Service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}