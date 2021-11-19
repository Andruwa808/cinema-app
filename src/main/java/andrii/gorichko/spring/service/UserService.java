package andrii.gorichko.spring.service;

import andrii.gorichko.spring.model.User;
import java.util.Optional;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
