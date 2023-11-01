package kg.megalab.finalprojectformegalab.services.admin;

import kg.megalab.finalprojectformegalab.models.dto.AuthAdminDTO;
import org.springframework.http.ResponseEntity;

public interface AuthAdminService {
    ResponseEntity<?> authAdmin(AuthAdminDTO authAdminDTO);
}
