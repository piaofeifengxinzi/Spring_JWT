package com.zhang.Api.Service;

import java.util.ArrayList;

import com.zhang.Api.Dao.UserDao;
import com.zhang.Api.Model.DAOUser;
import com.zhang.Api.Model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

//JWTUserDetailsService实现Spring Security UserDetailsService接口
//它会覆盖loadUserByUsername，以使用用户名从数据库中获取用户详细信息
//Spring Security Authentication Manager在验证用户提供的用户详细信息时，会调用此方法从数据库中获取用户详细信息


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        DAOUser user = (DAOUser) userDao.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }


    public UserDao save(UserDTO user) {
        DAOUser newUser = new DAOUser();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return (UserDao) userDao.save(newUser);
    }
}
