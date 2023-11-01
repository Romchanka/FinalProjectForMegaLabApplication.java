package kg.megalab.finalprojectformegalab.services.admin.impl;

import kg.megalab.finalprojectformegalab.models.dto.GetAdminDTO;
import kg.megalab.finalprojectformegalab.services.admin.SearchAdminService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class SearchAdminServiceImpl implements SearchAdminService {
    @Override
    public Set<GetAdminDTO> searchAdmin(String searchField) {
        return null;
    }
}
