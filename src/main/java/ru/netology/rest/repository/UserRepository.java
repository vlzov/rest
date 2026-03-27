package ru.netology.rest.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import ru.netology.rest.entity.Authorities;

@Repository
public class UserRepository {
    
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "admin123".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        
        return Collections.emptyList();
    }
}