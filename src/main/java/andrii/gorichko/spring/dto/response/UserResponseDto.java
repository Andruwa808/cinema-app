package andrii.gorichko.spring.dto.response;

import andrii.gorichko.spring.model.RoleName;
import java.util.List;

public class UserResponseDto {
    private Long id;
    private String email;
    private List<RoleName> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RoleName> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleName> roles) {
        this.roles = roles;
    }
}
