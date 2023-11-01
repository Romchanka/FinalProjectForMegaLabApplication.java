package kg.megalab.finalprojectformegalab.services.structure;

import kg.megalab.finalprojectformegalab.models.dto.CreateStructureDTO;
import org.springframework.http.ResponseEntity;

public interface StructureCreateService {
    ResponseEntity<?> createStructure(CreateStructureDTO createStructureDTO);
}
