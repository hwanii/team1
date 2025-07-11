package bitc.full502.team1.service;

import bitc.full502.team1.dto.UserDTO;

public interface AuthService {

    int isUserInfo(String userId, String userPw) throws Exception;

    UserDTO selectUserInfo(String userId) throws Exception;
}