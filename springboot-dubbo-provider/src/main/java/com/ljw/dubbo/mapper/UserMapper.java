package com.ljw.dubbo.mapper;

import com.ljw.dubbo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    List<User> selectAllUser();

}