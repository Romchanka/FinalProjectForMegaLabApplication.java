package kg.megalab.finalprojectformegalab.services.admin;

import kg.megalab.finalprojectformegalab.models.dto.CreateAdminDTO;
import org.springframework.http.ResponseEntity;

public interface CreateAdminService {

    ResponseEntity<String> create(CreateAdminDTO createAdminDTO);
}
