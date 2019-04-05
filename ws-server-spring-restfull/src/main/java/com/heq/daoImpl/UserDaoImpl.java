package com.heq.daoImpl;

import com.heq.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * Created user ： heqiang
 * created date : 2019/4/3 16:25
 * Description : No Description
 * version : 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public String queryUser() {
        log.info("欢迎使用springMVC");
        return "helloWold!";
    }
}
