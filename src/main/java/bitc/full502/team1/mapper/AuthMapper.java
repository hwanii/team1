package bitc.full502.team1.mapper;

import bitc.full502.team1.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthMapper {

    int isUserInfo(@Param("userId") String userId, @Param("userPw") String userPw) throws Exception;

    UserDTO selectUserInfo(@Param("userId") String userId) throws Exception;
}