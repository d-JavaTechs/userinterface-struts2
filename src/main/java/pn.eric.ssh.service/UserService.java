package pn.eric.ssh.service;

/**
 * Created by Shadow on 2016/7/20.
 */
import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pn.eric.ssh.bean.User;
import pn.eric.ssh.bean.UserForm;
import pn.eric.ssh.dao.UserDao;



@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public void regUser(UserForm userForm) throws HibernateException {
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        dao.saveObject(user);
    }

}