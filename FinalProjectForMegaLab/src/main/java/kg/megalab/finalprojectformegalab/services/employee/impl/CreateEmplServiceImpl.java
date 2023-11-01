package kg.megalab.finalprojectformegalab.services.employee.impl;

import kg.megalab.finalprojectformegalab.models.dto.CreateEmplDTO;
import kg.megalab.finalprojectformegalab.services.employee.CreateEmplService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateEmplServiceImpl implements CreateEmplService {
    @Override
    public ResponseEntity<?> create(CreateEmplDTO createEmplDTO) {
        return null;
    }
}
