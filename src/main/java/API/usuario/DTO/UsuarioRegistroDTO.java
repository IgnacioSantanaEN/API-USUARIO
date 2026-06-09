package API.usuario.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRegistroDTO {
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;
    @NotBlank(message = "El email no puede estar vacío")
    private String email;
    @NotBlank(message = "La contraseña no puede estar vacía")
    private String password;
    private String role;
}
