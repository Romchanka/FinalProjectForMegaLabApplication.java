package kg.megalab.finalprojectformegalab.services.structure;

import kg.megalab.finalprojectformegalab.models.dto.SearchStructureDTO;
import org.springframework.http.ResponseEntity;

public interface StructureSearchService {
    ResponseEntity<?> searchStructure(SearchStructureDTO searchField);
}
