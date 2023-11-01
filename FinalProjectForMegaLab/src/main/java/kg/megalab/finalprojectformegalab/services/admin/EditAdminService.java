package kg.megalab.finalprojectformegalab.services.admin;

import kg.megalab.finalprojectformegalab.models.dto.EditAdminDTO;
import org.springframework.http.ResponseEntity;

public interface EditAdminService {
    ResponseEntity<?> editAdmin(EditAdminDTO editAdminDTO);
}
