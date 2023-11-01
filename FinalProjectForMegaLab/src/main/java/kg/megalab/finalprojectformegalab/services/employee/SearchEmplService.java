package kg.megalab.finalprojectformegalab.services.employee;

import kg.megalab.finalprojectformegalab.models.dto.SearchEmplDTO;
import org.springframework.http.ResponseEntity;

public interface SearchEmplService {
    ResponseEntity<?> searchEmployee(SearchEmplDTO searchField);
}
