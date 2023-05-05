package com.israel.startupapi.services;

import com.israel.startupapi.controllers.PersonController;
import com.israel.startupapi.data.vo.v1.PersonVO;
import com.israel.startupapi.exceptions.RequiredObjectIsNullException;
import com.israel.startupapi.exceptions.ResourceNotFoundException;
import com.israel.startupapi.mapper.DozerMapper;
import com.israel.startupapi.model.Person;
import com.israel.startupapi.repositories.PersonRepository;
import com.israel.startupapi.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class UserServices implements UserDetailsService {
    private static final Logger log = LoggerFactory.getLogger(UserServices.class);

    @Autowired
    UserRepository repository;

    public UserServices(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Finding one user by name " + username + "!");
        var user = repository.findByUserName(username);
        if (user != null) {
            return user;
        } else {
            throw new UsernameNotFoundException("Username " + username + " not found!");
        }
    }
}


