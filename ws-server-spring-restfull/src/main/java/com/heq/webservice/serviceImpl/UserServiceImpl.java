package com.heq.webservice.serviceImpl;


import com.heq.entity.Car;
import com.heq.entity.User;
import com.heq.webservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 9:20
 * Description : No Description
 * version : 1.0
 */
public class UserServiceImpl implements UserService {

    Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public void addUser(User user) {
        log.info(user.toString());
        log.info("添加用户成功！！");
    }

    @Override
    public void updateUser(User user) {
        log.info(user.toString());
        log.info("更新用户成功！！");
    }

    @Override
    public User queryUser() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(101, "速腾", 100.24));
        cars.add(new Car(101, "别克", 500.69));
        User user = new User(1001, "阿强", "南京", cars);
        log.info("查询用户成功！！");
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        log.info("用户ID为：" + id);
        log.info("删除用户成功！！");
    }
}
