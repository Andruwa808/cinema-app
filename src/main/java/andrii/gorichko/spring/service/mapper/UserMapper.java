package andrii.gorichko.spring.service.mapper;

import andrii.gorichko.spring.dto.response.UserResponseDto;
import andrii.gorichko.spring.model.Role;
import andrii.gorichko.spring.model.User;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        responseDto.setRoles(user.getRoles().stream()
                .map(Role::getName)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
