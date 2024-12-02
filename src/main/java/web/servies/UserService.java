package web.servies;

import web.models.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void save(User user);

    User getOne(long id);

    void update(long id, User user);

    void delete(long id);
}
