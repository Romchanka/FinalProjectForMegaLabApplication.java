package kg.megalab.finalprojectformegalab.services.admin.impl;

import kg.megalab.finalprojectformegalab.models.dto.AuthAdminDTO;
import kg.megalab.finalprojectformegalab.services.admin.AuthAdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthAdminServiceImpl implements AuthAdminService {
    @Override
    public ResponseEntity<?> authAdmin(AuthAdminDTO authAdminDTO) {
        return null;
    }
}
