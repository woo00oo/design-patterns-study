package _02_structural_patterns._06_adapter.after;

import _02_structural_patterns._06_adapter.after.security.UserDetails;
import _02_structural_patterns._06_adapter.after.security.UserDetailsService;

public class AccountUserDetailService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
