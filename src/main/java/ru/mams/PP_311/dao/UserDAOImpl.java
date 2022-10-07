package ru.mams.PP_311.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.mams.PP_311.entity.User;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;




@Repository
public class UserDAOImpl implements UserDAO {



    @PersistenceContext()
    private final EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<User> getAllUsers() {

//        Session session = entityManager.unwrap(Session.class);
//        List <Employee> allEmployees = session.createQuery("from Employee",
//                        Employee.class).getResultList();

//        Query<Employee> query = session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmployees =query.getResultList();

        return entityManager.createQuery("from User", User.class ).getResultList();

    }

    @Override
    public void saveUser(User employee) {

//        Session session = entityManager.getCurrentSession();
//        session.saveOrUpdate(employee);
        if (ru.mams.PP_311.controller.MyController.checkUpdate = false
        )entityManager.persist(employee);
        else {
            entityManager.merge(employee);
            ru.mams.PP_311.controller.MyController.checkUpdate = false;
        }



    }

    @Override
    public User getUser(int id) {
//        Session session = entityManager.getCurrentSession();
///        Employee employee =session.get(Employee.class, id);
//        return employee;
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
//        Session session = entityManager.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee where id=:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
        entityManager.remove(entityManager.find(User.class, id));

    }
}
