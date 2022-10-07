package ru.mams.PP_311.dao;



import ru.mams.PP_311.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User employee);

    User getUser(int id);

    void deleteUser(int id);
}
