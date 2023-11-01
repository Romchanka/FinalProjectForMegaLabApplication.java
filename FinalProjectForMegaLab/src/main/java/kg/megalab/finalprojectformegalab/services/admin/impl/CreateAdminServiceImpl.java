package kg.megalab.finalprojectformegalab.services.admin.impl;

import kg.megalab.finalprojectformegalab.models.dto.CreateAdminDTO;
import kg.megalab.finalprojectformegalab.services.admin.CreateAdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateAdminServiceImpl implements CreateAdminService {
    @Override
    public ResponseEntity<String> create(CreateAdminDTO createAdminDTO) {

        return null ;
    }
}
