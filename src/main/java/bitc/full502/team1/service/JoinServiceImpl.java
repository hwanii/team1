package bitc.full502.team1.service;

import bitc.full502.team1.DTO.CustomerDTO;
import bitc.full502.team1.domain.entity.CustomerEntity;
import bitc.full502.team1.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class JoinServiceImpl implements JoinService {

    private final CustomerRepository customerRepository;

    public JoinServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void joinUser(CustomerDTO cdto) {
        CustomerEntity cent = new CustomerEntity();
        cent.setCustomerName(cdto.getCustomerName());
        cent.setCustomerId(cdto.getCustomerId());
        cent.setCustomerPass(cdto.getCustomerPass());
        cent.setCustomerEmail(cdto.getCustomerEmail());
        cent.setCustomerAddr(cdto.getCustomerAddr());
        cent.setCustomerPhone(cdto.getCustomerPhone());
        cent.setCustomerCoupon_yn("Y");

        customerRepository.save(cent);
    }
}
