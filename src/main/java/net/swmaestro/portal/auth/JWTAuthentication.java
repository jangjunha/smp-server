package net.swmaestro.portal.auth;

import net.swmaestro.portal.user.vo.User;
import org.springframework.security.authentication.AbstractAuthenticationToken;

import javax.security.auth.Subject;

/**
 * Created by junha on 2016. 10. 9..
 */
public class JWTAuthentication extends AbstractAuthenticationToken {
    private String token;
    private User user;
    private boolean authenticated;

    public JWTAuthentication(String token) {
        super(null);

        this.setToken(token);
        this.setAuthenticated(false);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }
}
