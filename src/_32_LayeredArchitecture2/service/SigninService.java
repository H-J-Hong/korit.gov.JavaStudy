package _32_LayeredArchitecture2.service;

import _32_LayeredArchitecture2.dto.SigninReqDto;

public interface SigninService {

    void signin(SigninReqDto signinReqDto);
    boolean isEmpty(String str);
}
