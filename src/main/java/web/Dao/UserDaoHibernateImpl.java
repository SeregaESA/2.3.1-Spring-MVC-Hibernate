package web.Dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional(readOnly = true)
public class UserDaoHibernateImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAll() {
        List<User> users = entityManager.createQuery("select u from User u", User.class).getResultList();
        return users;
    }

    @Override
    @Transactional
    public void save(String name, String lastName, byte age) {
        User user = new User(name, lastName, age);
        entityManager.persist(user);
    }

    @Override
    public User getOne(long id) {
        return entityManager.createQuery("select u from User u where u.id = :id", User.class).setParameter("id", id).getSingleResult();
    }

    @Override
    @Transactional
    public <T extends User> void update(long id, T user) {
        User updateUser = entityManager.find(User.class, id);
        updateUser.setName(user.getName());
        updateUser.setLastName(user.getLastName());
        updateUser.setAge(user.getAge());
        entityManager.merge(updateUser);
    }

    @Override
    @Transactional
    public void delete(long id) {
        User deleteUser = entityManager.find(User.class, id);
        entityManager.remove(deleteUser);
    }
}
