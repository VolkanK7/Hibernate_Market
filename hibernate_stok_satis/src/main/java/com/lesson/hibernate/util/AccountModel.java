/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lesson.hibernate.util;

import com.lesson.hibernate.entity.Account;
import org.hibernate.*;

public class AccountModel extends AbstractModel<Account>{
    public AccountModel(){
        super(Account.class);
    }
    
    /* login fonksiyonuna gönderilen username ve password bilgisi ile birlikte yazılan hql komutuyla veritabanındaki username ve password verilerinin gönderilen verilerle
    uyuşup uyuşmadığı kontrolü yapıldı. */
    public Account login(String username, String password){
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive()) 
                sessionFactory.getCurrentSession().getTransaction().begin();
            Query query = sessionFactory.getCurrentSession().createQuery("select acc from Account acc where acc.username=:username and acc.password=:password");
            query.setString("username", username);
            query.setString("password", password);
            return(Account)query.uniqueResult();
        } catch (Exception e) {
            return null;
        }
    }
}
