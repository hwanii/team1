package bitc.full502.team1.service;

import bitc.full502.team1.DTO.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public interface JoinService {
    void joinUser(CustomerDTO cdto);
}
