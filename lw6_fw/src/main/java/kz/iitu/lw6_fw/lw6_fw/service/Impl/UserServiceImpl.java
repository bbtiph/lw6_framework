package kz.iitu.lw6_fw.lw6_fw.service.Impl;

import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import kz.iitu.lw6_fw.lw6_fw.repository.UserRepository;
import kz.iitu.lw6_fw.lw6_fw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    Scanner in = new Scanner(System.in);
    @Override
    public Users validationUser() {
        System.out.print("Login:  ");
        String login = in.next();
        System.out.print("Password:  ");
        String pass = in.next();
        Users user = userRepository.findByLoginAndPassword(login, pass);
        return user;
    }
}
