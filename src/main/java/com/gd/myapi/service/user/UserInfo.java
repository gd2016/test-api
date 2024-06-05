package com.gd.myapi.service.user;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserInfo {
    public Long id;
    public String username;
    public String role;
}
