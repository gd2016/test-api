package com.gd.myapi.controller.user;

import com.gd.myapi.controller.user.vo.LoginReqVO;
import com.gd.myapi.controller.user.vo.LoginRespVO;
import com.gd.myapi.pojo.Result;
import com.gd.myapi.enums.ResultCodeEnum;
import com.gd.myapi.dal.dao.UserDO;
import com.gd.myapi.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    UserService userService;
    @GetMapping("/{id}")
    @ResponseBody
    public Result<UserDO> user(@PathVariable("id") Long id) {
        return new Result<>(ResultCodeEnum.SUCCESS, userService.getInfo(id));
    }

    @GetMapping("/login")
    public Result<LoginRespVO> login(LoginReqVO reqVO){
        return new Result<>(ResultCodeEnum.SUCCESS, userService.login(reqVO));
    }
}
