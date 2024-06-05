package com.gd.myapi.dal.dao;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@TableName(value = "system_users", autoResultMap = true) // 由于 SQL Server 的 system_user 是关键字，所以使用 system_users
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDO extends Base {
    @TableId
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String remark;
    private Long dept_id;
    private String post_ids;
    private String email;
    private String mobile;
    private Integer sex;
    private String avatar;
    private Integer status;
    private String login_ip;
    private Long tenant_id;
}
