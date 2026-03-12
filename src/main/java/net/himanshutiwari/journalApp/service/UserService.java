package net.himanshutiwari.journalApp.service;

import net.himanshutiwari.journalApp.entity.User;
import net.himanshutiwari.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
public class UserService {


    @Autowired
    private UserRepository userRepository;
    private static final PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();


    //creating the entry id name title .....
    public void saveNewUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));
        userRepository.save(user);
    }
    public void saveNewAdmin(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER","ADMIN"));
        userRepository.save(user);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    //getting the details
    public List<User> getAll(){
        return userRepository.findAll();
    }

    //find by id
    public Optional<User> findById(ObjectId id){
       return userRepository.findById(id);
    }

    //delete by id
    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
