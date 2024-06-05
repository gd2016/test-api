package com.gd.myapi.service.user;

import com.gd.myapi.controller.user.vo.LoginReqVO;
import com.gd.myapi.controller.user.vo.LoginRespVO;
import com.gd.myapi.dal.dao.UserDO;
import com.gd.myapi.dal.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserDO getInfo(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public LoginRespVO login(@Valid LoginReqVO vo) {
        UserDO user = userMapper.selectByUsername(vo.getUsername());
        System.out.println(user);
        LoginRespVO dd = new LoginRespVO();
        BeanUtils.copyProperties(user, vo);
        return dd;
    }
}
