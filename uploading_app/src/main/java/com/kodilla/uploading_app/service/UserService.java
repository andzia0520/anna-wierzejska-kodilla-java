package com.kodilla.uploading_app.service;

import com.kodilla.uploading_app.domain.CSVHelper;
import com.kodilla.uploading_app.domain.User;
import com.kodilla.uploading_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(MultipartFile file) {
        try {
            List<User> users = CSVHelper.csvToUsers(file.getInputStream());
            userRepository.saveAll(users);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

/*    public List<User> getAllTutorials() {
        return userRepository.findAll();
    }*/
}
