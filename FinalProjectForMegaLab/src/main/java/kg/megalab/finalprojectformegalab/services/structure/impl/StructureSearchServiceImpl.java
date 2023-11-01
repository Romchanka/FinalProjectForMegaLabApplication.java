package kg.megalab.finalprojectformegalab.services.structure.impl;

import kg.megalab.finalprojectformegalab.models.dto.SearchStructureDTO;
import kg.megalab.finalprojectformegalab.services.structure.StructureSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StructureSearchServiceImpl implements StructureSearchService {
    @Override
    public ResponseEntity<?> searchStructure(SearchStructureDTO searchField) {
        return null;
    }
}
