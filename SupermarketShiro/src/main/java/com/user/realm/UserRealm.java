package com.user.realm;

import com.supermarket.pojo.Users;
import com.supermarket.service.UsersService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashMap;

public class UserRealm extends AuthorizingRealm {

    @Resource
    private UsersService usersService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        SimpleAuthenticationInfo info = null;
        UsernamePasswordToken tk = (UsernamePasswordToken) token;

        String username = tk.getUsername();
        char[] pass = tk.getPassword();
        String password = new String(pass);
        Users users = null;
        HashMap<String,String> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        users = usersService.selectUserByUser(map);
        if (users != null){
            info = new SimpleAuthenticationInfo(username,password,getName());
        }
        return info;
    }
}
