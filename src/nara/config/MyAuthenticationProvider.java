package nara.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class MyAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String user = authentication.getPrincipal().toString();
        String password = authentication.getCredentials().toString();
        if ("narattom".equals(user) && "mondal1".equals(password)) {
            return new UsernamePasswordAuthenticationToken(user, password, Arrays.asList());
        } else {
            throw new BadCredentialsException("Invalid user/password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
