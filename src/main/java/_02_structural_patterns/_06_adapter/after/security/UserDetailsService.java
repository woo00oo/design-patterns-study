package _02_structural_patterns._06_adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
