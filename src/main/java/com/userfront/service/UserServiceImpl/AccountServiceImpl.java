package com.userfront.service.UserServiceImpl;


import com.userfront.domain.*;
import com.userfront.service.AccountService;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Date;

@Service
public abstract class AccountServiceImpl implements AccountService {
	
	private static int nextAccountNumber = 11223145;

    @Autowired
    private UserService userService;

    private int accountGen() {
        return ++nextAccountNumber;
    }

	

}
