package web.servies;

import web.models.User;

import java.util.List;

public interface UserService {

    <T extends User> List<T> getAll();

    void save(String name, String lastName, byte age);

    <T extends User> T getOne(long id);

    <T extends User> void update(long id, T user);

    void delete(long id);
}
