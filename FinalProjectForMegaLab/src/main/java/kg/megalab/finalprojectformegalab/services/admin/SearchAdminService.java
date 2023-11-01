package kg.megalab.finalprojectformegalab.services.admin;

import kg.megalab.finalprojectformegalab.models.dto.GetAdminDTO;
import org.springframework.http.ResponseEntity;

import java.util.Set;

public interface SearchAdminService {
    Set<GetAdminDTO> searchAdmin(String searchField);
}
