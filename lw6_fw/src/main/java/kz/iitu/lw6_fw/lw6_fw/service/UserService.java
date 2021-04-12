package kz.iitu.lw6_fw.lw6_fw.service;

import kz.iitu.lw6_fw.lw6_fw.entities.Users;

public interface UserService {
    Users validationUser(String log, String pass);
    Users changePass(Users user, String newpass);
}
