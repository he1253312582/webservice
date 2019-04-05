package com.heq.serviceImpl;

import com.heq.dao.UserDao;
import com.heq.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 16:27
 * Description : No Description
 * version : 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    Logger log = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserDao userDao;

    @Override
    public String queryUser() {

        return userDao.queryUser();
    }
}
