package com.gd.myapi.pojo;


import com.gd.myapi.enums.ResultCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private String msg;
    private Integer code;

    private T data;

    public Result(ResultCodeEnum codeEnum, T data){
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.data = data;
    }

}
