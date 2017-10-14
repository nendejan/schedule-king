package com.nendejan.scheduleking.Service;

import com.nendejan.scheduleking.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}