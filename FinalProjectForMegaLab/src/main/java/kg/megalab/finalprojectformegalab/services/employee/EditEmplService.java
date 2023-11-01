package kg.megalab.finalprojectformegalab.services.employee;

import kg.megalab.finalprojectformegalab.models.dto.EditEmplDTO;
import org.springframework.http.ResponseEntity;

public interface EditEmplService {
    ResponseEntity<?> editEmpl(EditEmplDTO editEmplDTO);
}
