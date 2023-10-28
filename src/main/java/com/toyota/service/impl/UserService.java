package com.toyota.service.impl;

import com.toyota.dto.BankResponse;
import com.toyota.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
