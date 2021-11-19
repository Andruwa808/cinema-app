package andrii.gorichko.spring.controller;

import andrii.gorichko.spring.dto.request.UserRequestDto;
import andrii.gorichko.spring.dto.response.UserResponseDto;
import andrii.gorichko.spring.model.User;
import andrii.gorichko.spring.service.AuthenticationService;
import andrii.gorichko.spring.service.mapper.UserMapper;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    private final UserMapper userMapper;

    public AuthenticationController(AuthenticationService authService, UserMapper userMapper) {
        this.authService = authService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRequestDto requestDto) {
        User user = authService.register(requestDto.getEmail(), requestDto.getPassword());
        return userMapper.mapToDto(user);
    }
}
