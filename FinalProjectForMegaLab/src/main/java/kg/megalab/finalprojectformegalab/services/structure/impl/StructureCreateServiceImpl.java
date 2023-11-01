package kg.megalab.finalprojectformegalab.services.structure.impl;

import kg.megalab.finalprojectformegalab.models.dto.CreateStructureDTO;
import kg.megalab.finalprojectformegalab.services.structure.StructureCreateService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StructureCreateServiceImpl implements StructureCreateService {
    @Override
    public ResponseEntity<?> createStructure(CreateStructureDTO createStructureDTO) {
        return null;
    }
}
