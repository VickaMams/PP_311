package ru.mams.PP_311.service;



import ru.mams.PP_311.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User employee);

    User getUser(int id);

    void deleteUser(int id);

}
