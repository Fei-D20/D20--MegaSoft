package com.login;

import com.model.User;

/**
 * @ author Fei Gu
 * @ create 2021-04-21-12.52
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public interface LoginInterface {
    public int loginCheck (String password, String userName); // 1(login success, 2, login fail, 3 create user

    public User createUser (String password, String userName);

    public User loginSuccess();

    public User checkCurrentUser();
}
