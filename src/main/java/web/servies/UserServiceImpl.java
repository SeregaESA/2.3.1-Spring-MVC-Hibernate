package web.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void save(String name, String lastName, byte age) {
        userDao.save(name, lastName, age);
    }

    @Override
    public User getOne(long id) {
        return userDao.getOne(id);
    }

    @Override
    public <T extends User> void update(long id, T user) {
        userDao.update(id, user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}
