package com.vladimirpandurov.invoice_manager4_02.service.implementation;

import com.vladimirpandurov.invoice_manager4_02.domain.User;
import com.vladimirpandurov.invoice_manager4_02.dto.UserDTO;
import com.vladimirpandurov.invoice_manager4_02.dtomapper.UserDTOMapper;
import com.vladimirpandurov.invoice_manager4_02.repository.UserRepository;
import com.vladimirpandurov.invoice_manager4_02.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(this.userRepository.create(user));
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return UserDTOMapper.fromUser(userRepository.getUserByEmail(email));
    }
}
