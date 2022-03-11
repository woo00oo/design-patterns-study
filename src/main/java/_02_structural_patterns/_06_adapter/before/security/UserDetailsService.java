package _02_structural_patterns._06_adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
