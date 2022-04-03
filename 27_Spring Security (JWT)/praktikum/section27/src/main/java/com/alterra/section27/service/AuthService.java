package com.alterra.section27.service;

import com.alterra.section27.model.PhoneResponse;
import com.alterra.section27.model.TokenResponse;
import com.alterra.section27.model.User;
import com.alterra.section27.model.UsernamePassword;

import javax.servlet.http.HttpServletRequest;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
    PhoneResponse generatePhone(HttpServletRequest request) ;
}
