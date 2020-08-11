package com.codeup.springblog.services;

import com.codeup.springblog.models.User;
import com.codeup.springblog.models.UserWithRoles;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader implements UserDetailsService {
    private final UserRepository users;

    public UserDetailsLoader(UserRepository users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        finds user and stores in user if matches
        User user = users.findByUsername(username);
//        runs if user doesnt match
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }
//      passes in user and returns users role
        return new UserWithRoles(user);
    }
}