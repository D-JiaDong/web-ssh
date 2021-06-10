package com.gyf.itedu.dao.impl;

import com.gyf.itedu.dao.IUserDao;
import com.gyf.itedu.model.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao{

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add(User user){
        hibernateTemplate.save(user);
    }

    @Override
    public int findforLogin(User user) {
        String hql= "from User u where username='"+user.getUsername()+"' and password='"+user.getPassword()+"'";
        List list = hibernateTemplate.find(hql);
        System.out.println(list.size());
        return list.size();
    }
}
