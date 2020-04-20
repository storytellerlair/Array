package com.haiyang.test;

import com.haiyang.bean.User;
import com.haiyang.utile.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class SelectTest {
    @Test
    public void select() throws SQLException {
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
//        String sql = "select * from userlogin";
//        List<User> userlist = runner.query(sql, new BeanListHandler<User>(User.class));
//        for (User user : userlist) {
//            System.out.println(user.getPassword() + "------" + user.getUsername());
//        }
//        //查询所有人数
//        String sql2 = "select count(*) from userlogin";
//        Long querynember = (Long) runner.query(sql2, new ScalarHandler());
//        System.out.print(querynember);
//        String sql3 = "select * from userlogin where username = ?";
//        User user = runner.query(sql3, new BeanHandler<>(User.class), "邹杰");
//        System.out.println(user.getPassword() + "---" + user.getUsername());
        String sql = "insert into userlogin(username,password) values(?,?)";
        User user = new User();
        user.setUsername("杨磊");
        user.setPassword("123456");
        int update = runner.update(sql, user.getUsername(),user.getPassword());
        System.out.println(update);

    }
}
