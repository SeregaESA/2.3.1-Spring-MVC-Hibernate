package web.Dao;

import web.models.User;

import java.util.List;


public interface UserDao {

    List<User> getAll();

    void save(User user);

    User getOne(long id);

    void update(long id, User user);

    void delete(long id);
}
