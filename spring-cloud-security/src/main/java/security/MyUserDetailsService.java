package security;

import security.domain.SysUserDO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Reimia
 */
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUserDO sysUserDO = new SysUserDO();
        sysUserDO.setUsername("123");
        sysUserDO.setPassword("123");

        return User.builder()
                .username(sysUserDO.getUsername())
                .password(sysUserDO.getPassword())
                .build();

    }
}
