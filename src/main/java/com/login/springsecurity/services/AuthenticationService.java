package com.login.springsecurity.services;

import com.login.springsecurity.dto.JwtAuthenticationResponse;
import com.login.springsecurity.dto.RefreshTokenRequest;
import com.login.springsecurity.dto.SignUpRequest;
import com.login.springsecurity.dto.SigninRequest;
import com.login.springsecurity.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
