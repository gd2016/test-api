package com.gd.myapi.service.user;

import com.gd.myapi.controller.user.vo.LoginReqVO;
import com.gd.myapi.controller.user.vo.LoginRespVO;
import com.gd.myapi.dal.dao.UserDO;

import javax.validation.Valid;

public interface UserService {
    UserDO getInfo(Long id);

    LoginRespVO login(@Valid LoginReqVO vo);
}