package com.vladimirpandurov.invoice_manager4_02.service;

import com.vladimirpandurov.invoice_manager4_02.domain.User;
import com.vladimirpandurov.invoice_manager4_02.dto.UserDTO;

public interface UserService {

    UserDTO createUser(User user);

    UserDTO getUserByEmail(String email);

}
