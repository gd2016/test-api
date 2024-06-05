package com.gd.myapi.dal.mapper;//package com.gd.api.web.dal.mapper;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gd.myapi.dal.dao.UserDO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    default UserDO selectByUsername(String username){
        return selectOne(new LambdaQueryWrapper<UserDO>().eq(UserDO::getUsername, username));
//        return selectOne(UserDO::getUsername,username);
    }
}
