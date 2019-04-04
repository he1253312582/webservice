package com.heq.webservice.serviceImpl;


import com.heq.entity.Car;
import com.heq.entity.User;
import com.heq.webservice.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created user ： heqiang
 * created date : 2019/4/4 9:20
 * Description : No Description
 * version : 1.0
 */
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {


    @Override
    public void addUser(User user) {

        System.out.println(user);
        System.out.println("添加用户成功！！");
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user);
        System.out.println("更新用户成功！！");
    }

    @Override
    public User queryUser() {
        List<Car> cars =new ArrayList<Car>();
        cars.add(new Car(101,"速腾",100.24));
        cars.add(new Car(101,"别克",500.69));
       User user =new User(1001,"阿强","南京",cars);

        System.out.println("查询用户成功！！");
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("用户ID为："+id);
        System.out.println("删除用户成功！！");
    }
}
