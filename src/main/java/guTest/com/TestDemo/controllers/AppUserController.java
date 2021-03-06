package guTest.com.TestDemo.controllers;


import guTest.com.TestDemo.models.AppUser;
import guTest.com.TestDemo.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/appUserApi")
public class AppUserController {

    private AppUserRepo appUserRepo;

    @Autowired
    public AppUserController(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    @GetMapping
    public List<AppUser> getAllUsers() {
        return  appUserRepo.findAll();
    }
}
