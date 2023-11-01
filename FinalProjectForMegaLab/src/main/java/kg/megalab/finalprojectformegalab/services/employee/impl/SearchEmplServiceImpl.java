package kg.megalab.finalprojectformegalab.services.employee.impl;

import kg.megalab.finalprojectformegalab.models.dto.SearchEmplDTO;
import kg.megalab.finalprojectformegalab.services.employee.SearchEmplService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SearchEmplServiceImpl implements SearchEmplService {
    @Override
    public ResponseEntity<?> searchEmployee(SearchEmplDTO searchField) {
        return null;
    }
}
