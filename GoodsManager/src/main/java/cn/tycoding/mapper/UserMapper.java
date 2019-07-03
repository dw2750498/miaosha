package cn.tycoding.mapper;

import cn.tycoding.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther TyCoding
 * @date 2018/9/28
 */
@Mapper
public interface UserMapper {

    //查询所有用户
    List<User> findAll();

    //按id查找用户
    List<User> findById(Long id);

    //创建用户
    void create(User user);

    //删除用户
    void delete(Long id);

    //修改用户
    void update(User user);

    //按name查找用户
    User findByName(String name);
}
