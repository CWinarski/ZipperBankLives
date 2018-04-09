package io.zipcoder.service.implementations;

import io.zipcoder.domain.Account;
import io.zipcoder.service.interfaces.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * project: zcwbank
 * package: io.zipcoder.service
 * author: https://github.com/vvmk
 * date: 4/9/18
 */
@Service
public class AccountServiceImpl implements AccountService {

    public ResponseEntity<Iterable<Account>> getAllAccounts() {
        return null;
    }
}