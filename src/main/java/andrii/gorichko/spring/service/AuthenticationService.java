package andrii.gorichko.spring.service;

import andrii.gorichko.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
