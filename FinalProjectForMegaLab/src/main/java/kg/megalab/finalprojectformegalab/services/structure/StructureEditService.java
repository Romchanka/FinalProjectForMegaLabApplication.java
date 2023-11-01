package kg.megalab.finalprojectformegalab.services.structure;

import kg.megalab.finalprojectformegalab.models.dto.EditStructureDTO;
import org.springframework.http.ResponseEntity;

public interface StructureEditService {
    ResponseEntity<?> editStructure(EditStructureDTO editStructureDTO);
}
