package com.zcbdqn.test;

import com.zcbdqn.dao.UserMapper;
import com.zcbdqn.pojo.User;
import com.zcbdqn.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    private static Logger logger= Logger.getLogger("Test");

    public static void main(String[] args) {

        getUsers();
        //update();
        //getUsersByRoles();

        //getUserByMap();
        //getUsers3();

    }

    private static void getUsers3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersByNameOrGender("", null);
        for (User user:users){
            logger.debug(user);
        }
        MybatisUtils.closeSqlSession();
    }

    private static void getUserByMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Map<String,Object> params=new HashMap<>();
        params.put("gender",1);
        params.put("roleIds", Arrays.asList(2,3));

        List<User> users = sqlSession.getMapper(UserMapper.class).getUserByMap(params);
        for (User user:users){
            logger.debug(user);
        }
        MybatisUtils.closeSqlSession();
    }

    private static void getUsersByRoles() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).getUserByRoleList(Arrays.asList(2,3));
        for (User user:users){
            logger.debug(user);
        }
        MybatisUtils.closeSqlSession();
    }

    private static void update() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        User user=new User();
        user.setUserName("tom");
        user.setId(2);
        sqlSession.getMapper(UserMapper.class).update(user);
        MybatisUtils.closeSqlSession();
    }

    private static void getUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsers("", 0,5,5);
        for (User user:users){
            logger.debug(user);
        }

        MybatisUtils.closeSqlSession();
    }
}
