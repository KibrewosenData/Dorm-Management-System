package edu.mum.cs544.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import java.util.Collection;

public class AuthenticationWithToken extends PreAuthenticatedAuthenticationToken {

    public AuthenticationWithToken(Object aPrincipal, Object aCredentials) {
        super(aPrincipal, aCredentials);
    }

    public AuthenticationWithToken(Object aPrincipal, Object aCredentials, Collection<? extends GrantedAuthority> anAuthorities) {
        super(aPrincipal, aCredentials, anAuthorities);
    }

    public String getToken() {
        return (String) getDetails();
    }

    public void setToken(String token) {
        setDetails(token);
    }
}
