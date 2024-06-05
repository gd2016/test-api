package com.gd.myapi.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    NO_AUTH(401, "无权限访问"),
    NOT_FOUND(404, "资源未找到"),
    SERVER_ERROR(601, "服务器异常,请稍后重试"),
    PARAMETERS_ERROR(602, "参数错误"),
    FILE_UPLOAD_FAIL(603, "文件上传失败,请稍后重试"),
    PARAM_ERROR(604, "参数异常"),
    RESOURCE_ERROR(605, "资源不足,请联系管理员"),
    EXISTS(606, "资源已存在"),
    ;
    private Integer code;
    private String msg;
}
