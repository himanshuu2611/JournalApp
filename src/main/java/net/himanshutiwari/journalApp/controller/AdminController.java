package net.himanshutiwari.journalApp.controller;

import net.himanshutiwari.journalApp.entity.User;
import net.himanshutiwari.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/all-users")
    public ResponseEntity<?> getAllusers(){
        List<User> all = userService.getAll();
        if(!all.isEmpty() && all!=null){
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping("create-admin-user")
    public void createAdminUser(@RequestBody User user){
        userService.saveNewAdmin(user);
    }
}
