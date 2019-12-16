package com.zcbdqn.dao;

import com.zcbdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 改造查询用户信息列表的演示示例，增加查询条件
     * @param userName 用户名称（模糊查询）
     * @param userRole 用户角色（根据角色id查询）
     * @return 用户信息列表
     */
    List<User> getUsers(@Param("userName") String userName,
                        @Param("userRole") Integer userRole,
                        @Param("startRow") Integer startRow,
                        @Param("pageSize") Integer pageSize);

    /**
     * 更新
     * @param user
     * @return
     */
    int update(User user);

    List<User> getUserByRoles(Integer[] roleIds);

    List<User> getUserByRoleList(List<Integer> roleIds);

    List<User> getUserByMap(Map<String,Object> params);

    List<User> getUsersByNameOrGender(@Param("userName") String userName,@Param("gender") Integer gender);
}
