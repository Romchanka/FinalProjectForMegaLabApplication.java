package kg.megalab.finalprojectformegalab.services.employee;

import kg.megalab.finalprojectformegalab.models.dto.CreateEmplDTO;
import org.springframework.http.ResponseEntity;

public interface CreateEmplService {
    ResponseEntity<?> create(CreateEmplDTO createEmplDTO);
}
